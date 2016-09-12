# HtmlTextView
Android use TextView show Html. Support <span> and custom <fonts>

由于Android不支持 font 标签的 size 所以自定义span标签来实现


### Screenshot

<p align="center">
  <img src="https://github.com/helloHaifei/HtmlTextView/blob/master/screenshot.png?raw=true" width="300"  alt="Screenshot"/>
</p>

java code
``` java
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

```

style
``` html
<span style="font-size:16px;color:#666666;size:16px"><font>title</font></span>
<fonts size='24' color='#ff0000'>title</fonts>
```
