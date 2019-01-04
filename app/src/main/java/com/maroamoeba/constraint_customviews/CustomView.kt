package com.maroamoeba.constraint_customviews

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_view.view.*


class MyCustomView : ConstraintLayout {

    // ボタンクリック時にアクティビティのメソッドを実行するイベントリスナーの定義
    var buttonTapped1: (() -> Unit)? = null
    var buttonTapped2: (() -> Unit)? = null

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        Log.d("DebugMsg", "initMyCustomView")
        View.inflate(context, R.layout.custom_view, this)

        button1.setOnClickListener {
            // アクティビティへのコールバック　ボタンが押されたことをアクティビティに伝える
            buttonTapped1?.invoke()

            Toast.makeText(context, "ButtonClicked 1", Toast.LENGTH_LONG).show()
            myTextView.text = "こんにちは！"
        }

        button2.setOnClickListener {
            buttonTapped2?.invoke()

            Toast.makeText(context, "ButtonClicked 2", Toast.LENGTH_LONG).show()
            myTextView.text = "こんばんは！"
        }

    }

}