package sample2402;

import org.openqa.selenium.DeviceRotation;

/**
 * Created by lingalal on 24/02/2020.
 */
public class Electronic implements Device
{


    public void doIt() {

    }}
    abstract class phone1 extends Electronic {}
abstract class Phone2 extends Electronic
{
public void doIt(int x){}
}
class Phone3 extends Electronic implements Device
{
    public void doStuff(){}
}

interface Device {public void doIt();}