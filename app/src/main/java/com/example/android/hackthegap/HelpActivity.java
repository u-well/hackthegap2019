package com.example.android.hackthegap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import com.twilio.type.PhoneNumber;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        Button smsbutton = (Button) findViewById(R.id.smsbutton);
        //smsbutton.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
                //onSmsClick();

            //}


        //});


    }

    /*public void onSmsClick(){
        String ACCOUNT_SID = "ACfaac42048994c9996be0bac5ebea70c5";
        String AUTH_TOKEN = "800183d18af574df943bdfcdfabdb84f";
        String prevalidatedto = "+15073512831";
        PhoneNumber from = new PhoneNumber("+15072257969");
        String username = "Olive Oil";
        String message = "Hello, this is When I Need U reaching out to let you know that your friend/loved one " + username + " has been static for a period of time, it would be a good idea to reach out to them.";
        if(validatePhoneFormat(prevalidatedto)){


        }else{
            //default to selected help SMS line
            prevalidatedto = "+15555555555";
        }
        PhoneNumber to = new PhoneNumber(prevalidatedto);
        SmsHeaders smsHeader = new SmsHeaders(ACCOUNT_SID, AUTH_TOKEN, to, from, username, message);
        Sms sms = new Sms();
        sms.sendSMS(smsHeader);


    }

    public Boolean validatePhoneFormat(String phoneString){
        String pattern = "[+]\\d{11}";
        if(phoneString.matches(pattern)){
            return true;
        }else{
          return false;

        }

    }*/
}
