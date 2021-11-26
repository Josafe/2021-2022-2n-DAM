import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:flutter_application_3/main.dart';
import 'package:flutter_application_3/src/MyHomePage.dart';
import 'package:flutter_application_3/src/MyHomePageState.dart';
import 'package:flutter_application_3/src/profile_page.dart';
import 'package:flutter_application_3/src/homepage.dart';

//Importamos lo del timer
import 'package:flutter_application_3/src/CountDownPage.dart';

class Menu extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Menu'),
      ),
      body: Center(
        //Tipo lista
        child: ListView(
          children: <Widget>[
            ListTile(
              onTap: () {
                Navigator.push(
                  context,
                  //Aqui se vincula el perfil
                  MaterialPageRoute(builder: (context) => HomePage()),
                );
              },
              leading: Icon(
                Icons.shop,
                color: Colors.green,
              ),
              title: Text('Shop'),
              trailing: Icon(
                Icons.arrow_right_outlined,
                color: Colors.green,
              ),
            ),
            ListTile(
              onTap: () {
                Navigator.push(
                  context,
                  //Aqui se vincula el Contador
                  MaterialPageRoute(builder: (context) => CountdownPage()),
                );
              },
              leading: Icon(
                Icons.timer,
                color: Colors.green,
              ),
              title: Text('Timer'),
              trailing: Icon(
                Icons.arrow_right_outlined,
                color: Colors.green,
              ),
            ),
            ListTile(
              onTap: () {
                Navigator.push(
                  context,
                  //Aqui se vincula el perfil
                  MaterialPageRoute(builder: (context) => Profile()),
                );
              },
              leading: Icon(
                Icons.person,
                color: Colors.green,
              ),
              title: Text('Profile'),
              trailing: Icon(
                Icons.arrow_right_outlined,
                color: Colors.green,
              ),
            ),
            ListTile(
              onTap: () {
                //Aqui se vincula el perfil
                Navigator.pop(context, "Audio1");
              },
              leading: Icon(
                Icons.logout,
                color: Colors.green,
              ),
              title: Text('Logout'),
            ),
          ],
        ),
      ),
    );
  }
}
