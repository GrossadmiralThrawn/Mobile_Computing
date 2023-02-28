package mobile_computing.Main_Package




class Sleeper_Class(private var Time_To_Sleep: Long): Thread()
{
    override fun run()
    {
        sleep(Time_To_Sleep)
    }
}