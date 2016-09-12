package com.zhf.htmltextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    /**
     * span 标签 , 只识别了 font-size, color属性
     */
    String htmlSpan = "<p><span style=\"font-size:24px;color:#0000ff\"><font>我是Span 标题</font></span><span style=\"font-size:16px;color:#ff0000\"><font>+x</font></span></p><p><span style=\"font-size:16px;color:#999999\"><font>我是Span 内容</font></span></p>";

    /**
     * 自定义的fonts 标签
     */
    String htmlCustomFonts = "<p><fonts size='24' color='#ff0000'>我是标题自定义字号颜色<strike>删除线</strike></fonts></p>"+
            "<p><fonts size='16' color='#00ee00'>我是内容自定义字号颜色</fonts></p>";

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textview);

        mTextView.setLineSpacing(0, 0.7f);

        mTextView.setText(Html.fromHtml(htmlSpan + htmlCustomFonts,  null, new MyTagHandler(this)));


    }





}
