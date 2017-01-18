#Download

Download the latest JAR or grab via Maven:
~~~xml
<dependency>
  <groupId>com.zsh.code</groupId>
  <artifactId>dragindicator</artifactId>
  <version>2.0.1</version>
  <type>pom</type>
</dependency>
~~~
or Gradle:
~~~gradle
compile 'com.zsh.code:dragindicator:2.0.1'
~~~
```****```<title>带拖拽效果的红点提示控件 DragIndicatorView</title>
<br/>
<img src="https://github.com/siwangqishiq/DragIndicatorView/blob/master/images/demo1.gif" width=300 />
<br/>

<p>
    可以通过拖拽消失的小红点提示
</p>
<p>DragIndicatorView扩展自TextView  可当成普通TextView使用</p>

<p>手动触发红点消失:</p>
<pre>
<code>
    mDragIndicatorView.dismissView();
</code>
</pre>

<p>当需要监听红点消失事件时 可设置监听如下:</p>
<pre>
<code>
    mDragIndicatorView.setOnDismissAction(new DragIndicatorView.OnIndicatorDismiss() {
                @Override
                public void OnDismiss(DragIndicatorView view) {
                    //TODO  当红点因拖拽或调用dismissView消失时
                }
            });
</code>
</pre>
