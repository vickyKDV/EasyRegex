# EasyRegex 
Version [![](https://jitpack.io/v/vickyKDV/EasyRegex.svg)](https://jitpack.io/#vickyKDV/EasyRegex)
## How to Use simple regex with EasyRegex

#Implementation
        
        allprojects {
            repositories {
            ...
            maven { url 'https://jitpack.io' }
          }
        }

       dependencies {
          implementation 'com.github.vickyKDV:EasyRegex:$VERSION'
       }
        
        
Setup
              EditText edt = findViewById(R.id.edt);

              //Char Validation
              EasyRegex.setEasyCharRegex(edt);

              //Custom Validation ( Character with special char _ / underscore only )
              EasyRegex.setEasyRegex(edt,"[a-zA-Z_]+");

              //Number Validation
              EasyRegex.setEasyNumberRegex(edt);


              //Email Validation
              EasyRegex.setEasyRegex(edt, EasyRegex.regStyle.emailPattern);
        
