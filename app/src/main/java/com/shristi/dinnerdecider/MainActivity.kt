package com.shristi.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.collections.random as random

class MainActivity : AppCompatActivity() {
    var foodList: ArrayList<String> =
        arrayListOf<String>("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //video note: interaction between the activity and layout
        setContentView(R.layout.activity_main)

        addFood.setOnClickListener {
            foodList.add(editTextFoodName.text.toString())
            showAlert()
            editTextFoodName.setText("")
        }
    }

    fun decide(view: View) {
//        (editTextFoodName as TextView).text = foodList.random()
        editTextFoodName.setText(foodList.random())
    }

    fun showAlert() {
        val dialogBuilder = AlertDialog.Builder(this)
        // set message of alert dialog
        dialogBuilder.setMessage("New food successfully added to list!").setCancelable(true)
        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setTitle("Food added!")
        // show alert dialog
        alert.show()
    }

}