<!-- #######  YAY, I AM THE SOURCE EDITOR! #########-->
<h1 style="text-align: justify;"># PrefsLib</h1>
<p style="text-align: justify;">This is a simple example for write data into sharedpreferences and get values from it. You just need to add&nbsp;one class that is "<strong><span style="color: #0000ff;"><span style="text-decoration: underline;">PrefsUtil</span></span></strong>" from this example and use it.</p>
<ul>
<li style="text-align: justify;">
<h3 style="text-align: justify;">You can read/write String,int,float,boolean types of data&nbsp;using simple single statement like :</h3>
<ul>
<li>
<p>PrefsUtil.with(context).write("<span style="color: #0000ff;">key</span>", "<span style="color: #0000ff;">value</span>");</p>
<ul>
<li>
<pre>PrefsUtil.with(this).write("testInt",55);</pre>
</li>
</ul>
</li>
<li>
<p>PrefsUtil.with(context).readInt("<span style="color: #0000ff;">key</span>");&nbsp;</p>
<ul>
<li>
<pre>PrefsUtil.with(this).readInt("testInt");</pre>
</li>
</ul>
</li>
</ul>
</li>
<li>
<h3 style="text-align: justify;">"key" is simply identification for values.</h3>
</li>
</ul>
