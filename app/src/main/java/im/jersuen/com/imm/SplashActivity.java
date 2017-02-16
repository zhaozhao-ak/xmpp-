package im.jersuen.com.imm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * 启动引导页
 */
class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //进入登录界面
//        gotoLoginActivity();

//        Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
//        startActivity(intent);
//        finish();
    }

    /**
     * 停留三秒进入登录界面
     */
    private void gotoLoginActivity() {
        //主线程执行

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();






//        ThreadUtil.runInChildThread(new Runnable() {
//            @Override
//            public void run() {
//                //停留三秒
//                SystemClock.sleep(3000);
//                //进入登录界面
//                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });
    }
}
