package im.jersuen.com.imm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

import im.jersuen.com.imm.utils.ThreadUtil;

/**
 * Created by Administrator on 2017/2/16.
 */

public class SplashAc extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        gotoLoginActivity();
    }

    private void gotoLoginActivity() {
        //主线程执行

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(3000);
//                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
//                    startActivity(intent);
//                    finish();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();






        ThreadUtil.runInChildThread(new Runnable() {
            @Override
            public void run() {
                //停留三秒
                SystemClock.sleep(3000);
                //进入登录界面
                Intent intent = new Intent(SplashAc.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
