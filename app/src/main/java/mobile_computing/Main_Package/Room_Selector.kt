package mobile_computing.Main_Package

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Room_Selector : AppCompatActivity() {
    var Room: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_selector)


        var Way_Descriptor_Activity = Intent(this, Way_Descriptor::class.java)
        var EditText_Room_Name_Input: EditText = findViewById<EditText>(R.id.editText_Room_Name)
        var TextView_Fehlerbehandlung: TextView = findViewById(R.id.textView_False_Input)
        var Test_Array = arrayOf("TaC", "G/-1/19", "G/-1/20", "G/-1/21")
        val Test_Array_Last: String = Test_Array.last()
        var Select_Button: Button = findViewById(R.id.Button_Room_Input)


        TextView_Fehlerbehandlung.visibility = View.INVISIBLE



        Select_Button.setOnClickListener {
            Room = EditText_Room_Name_Input.text.toString()




            if (Room != "" || Room != null)
            {
                for (element in Test_Array)
                {
                    if (Room == element)
                    {
                        Way_Descriptor_Activity.putExtra("Room_Name", Room)


                        startActivity(Way_Descriptor_Activity)
                    }
                    else
                    {
                        if (element == Test_Array_Last)
                        {
                            TextView_Fehlerbehandlung.text = "Room not found"
                        }
                        else
                        {
                            continue
                        }
                    }
                }
            } else {
                TextView_Fehlerbehandlung.visibility = View.VISIBLE
            }
        }


    }
}