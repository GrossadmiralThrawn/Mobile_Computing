package mobile_computing.Main_Package

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val Select_Language = Intent(this, Select_Language_Activitiy::class.java)
        val Primary_Settings = getSharedPreferences("My_Primary_Preferences", 0)
        var Edit_Language: SharedPreferences.Editor = Primary_Settings.edit()
        val Language_Key = "Language Key"



        if ((Primary_Settings.getString(Language_Key, "") == null) || (Primary_Settings.getString(Language_Key, "") == ""))
        {
            var Sleeper_1: Sleeper_Class = Sleeper_Class(1000)



            Sleeper_1.start()



            startActivity(Select_Language)
        }
        else
        {
            val Test_TextView: TextView = findViewById(R.id.TextView_MainActivity)
        }
    }
}