package mobile_computing.Main_Package

import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Configuration
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val Primary_Settings                           = getSharedPreferences("My_Primary_Preferences", 0)
        var Edit_Language:    SharedPreferences.Editor = Primary_Settings.edit()
        val Language_Key                               = "Language Key"
        var Settings_Setter:  Configuration            = Configuration()





        if ((Primary_Settings.getString(Language_Key, "") == null) || (Primary_Settings.getString(Language_Key, "") == ""))
        {
            var Select_Language                            = Intent(this, Select_Language_Activitiy::class.java)
            val Test_TextView: TextView = findViewById(R.id.TextView1_MainActivity)
            var Sleeper_1: Sleeper_Class = Sleeper_Class(1000)



            Test_TextView.text = "Welcome"


            Sleeper_1.start()



          startActivity(Select_Language)
}
/*else
{
    val Test_TextView:            TextView = findViewById(R.id.TextView_MainActivity)
    val Change_To_Room_Selector:  Intent   = Intent(this, Room_Selector::class.java)


    startActivity(Change_To_Room_Selector)
}*/
}
}