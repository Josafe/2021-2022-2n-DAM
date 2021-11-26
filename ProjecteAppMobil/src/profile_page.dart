import 'package:flutter/material.dart';
import 'package:flutter/src/widgets/basic.dart';
import 'package:flutter_application_3/src/menu.dart';

//Comezamos xD

class Profile extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Profile Setting')),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text(
              'Choose your name',
              textAlign: TextAlign.right,
            ),
            SizedBox(height: 70, width: 100, child: TextField()),
            Text(
              'Choose your Surname',
              textAlign: TextAlign.right,
            ),
            SizedBox(height: 70, width: 100, child: TextField()),
            Text(
              'Age',
              textAlign: TextAlign.right,
            ),
            SizedBox(height: 70, width: 100, child: TextField()),
            Text(
              'Country',
              textAlign: TextAlign.right,
            ),
            SizedBox(height: 70, width: 100, child: TextField()),
            Text(
              'City',
              textAlign: TextAlign.right,
            ),
            SizedBox(height: 70, width: 100, child: TextField()),
            Text(
              'E-mail',
              textAlign: TextAlign.right,
            ),
            SizedBox(height: 70, width: 100, child: TextField()),
            FloatingActionButton(
              child: Icon(Icons.send),
              onPressed: () {
                Navigator.push(
                    context, MaterialPageRoute(builder: (context) => Menu()));
              },
            )
          ],
        ),
      ),
    );
  }
}
