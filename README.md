# Constraint-CustomViews

KotlinでConstraintレイアウトを使用し、CustomViewsを作成しました。  
参考にした記事よりもさらにシンプルに実装されています。

## ざっくりポイント  
・custom_view.xmlのmergeタグで明示してあげるとandroid側が認識しやすくなる(しなくても動くは動く)
・custom_view.xmlは、tools:parentTag="android.support.constraint.ConstraintLayout"を記述してあげるとConstraintLayoutのGUIで編集しやすくなる。
・カスタムビュークラスはちゃんとコンストラクターを構築。他に@JvmOverloadsなど、このへんは多くの記事で説明されている。
・CostomViewクラスのinit内にView.inflate(context, R.layout.custom_view, this)を記述しないと動かない。
・あとはactyvity_main.xmlに対して、カスタムビュークラスのを記述してあげる。

参考:  
https://jordan-dixon.com/2017/12/30/custom-views-with-constraint-layout-and-kotlin/  
http://android.techblog.jp/archives/8699849.html  
