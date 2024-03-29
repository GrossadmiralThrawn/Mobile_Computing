package mobile_computing.Main_Package




import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*




class Select_Language_Activitiy : AppCompatActivity() {
    lateinit var Deutsch_Checkbox: CheckBox
    lateinit var English_Checkbox: CheckBox
    lateinit var Franzoesisch_Checkbox: CheckBox
    lateinit var Select_Language_Button: Button
    lateinit var Place: Locale




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_language_activitiy)



        Deutsch_Checkbox = findViewById(R.id.checkBox_Deutsch)
        English_Checkbox = findViewById(R.id.checkBox_Englisch)
        Franzoesisch_Checkbox = findViewById(R.id.checkBox_Franzoesisch)
        Select_Language_Button = findViewById(R.id.Select_Language_Button)
        val Forward_To_Room_Selector = Intent(this, Room_Selector::class.java)
        var Settings_Setter: Configuration = Configuration()




        Select_Language_Button.setOnClickListener(View.OnClickListener()
        {
            val Language_Key: String = "Language Key"
            val Primary_Settings = getSharedPreferences("My_Primary_Preferences", 0)
            val Edit_Language: SharedPreferences.Editor = Primary_Settings.edit()
            val To_Many_Arguments: TextView = findViewById(R.id.textView_To_Many_Arguments)



            if (Deutsch_Checkbox.isChecked && (English_Checkbox.isChecked || Franzoesisch_Checkbox.isChecked))
            {
                To_Many_Arguments.visibility = View.VISIBLE
            }
            else
            {
                if ((English_Checkbox.isChecked && (Deutsch_Checkbox.isChecked || Franzoesisch_Checkbox.isChecked)) || (Franzoesisch_Checkbox.isChecked && (Deutsch_Checkbox.isChecked || English_Checkbox.isChecked)))
                {
                    To_Many_Arguments.visibility = View.VISIBLE
                }
                else
                {
                    if (Deutsch_Checkbox.isChecked) {
                        Edit_Language.putString(Language_Key, "de")
                        Edit_Language.commit()



                        Place = Locale("de", "de")


                        Settings_Setter.setLocale(Place)



                        startActivity(Forward_To_Room_Selector)
                    }
                    else
                    {
                        if (English_Checkbox.isChecked)
                        {
                            Edit_Language.putString(Language_Key, "en")
                            Edit_Language.commit()


                            Place = Locale("en", "en")


                            Settings_Setter.setLocale(Place)



                            startActivity(Forward_To_Room_Selector)
                        }
                        else
                        {
                            if (Franzoesisch_Checkbox.isChecked)
                            {
                                Edit_Language.putString(Language_Key, "fr")
                                Edit_Language.commit()


                                startActivity(Forward_To_Room_Selector)
                            }
                            else
                            {
                                To_Many_Arguments.text = "Please select a language"
                            }
                        }
                    }
                }
            }
        })
    }

}