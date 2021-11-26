import 'package:flutter/material.dart';
import 'package:flutter_application_3/src/MyHomePage.dart';
import 'package:flutter/src/widgets/basic.dart';
import 'package:flutter/src/material/floating_action_button_location.dart';
import 'package:flutter_application_3/src/menu.dart';

class MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      resizeToAvoidBottomInset: false,
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Icon(Icons.coffee, size: 200.0, color: Colors.green),
            Text(
              'S.H.T.M.M',
              textAlign: TextAlign.center,
              style: TextStyle(
                fontFamily: 'Tomson Talks',
                fontSize: 40,
                color: Colors.green,
              ),
            ),
            SizedBox(height: 90.0, width: 50.0),
            Text(
              'Email',
              style: TextStyle(fontSize: 25, color: Colors.green),
            ),
            SizedBox(
                height: 90.0,
                width: 250.0,
                child: TextField(
                    keyboardType: TextInputType.emailAddress,
                    textAlign: TextAlign.center,
                    decoration: InputDecoration(
                      border: InputBorder.none,
                      prefixIcon: Icon(Icons.email, color: Colors.green),
                    ))),
            Text('Password',
                style: TextStyle(fontSize: 25, color: Colors.green),
                textAlign: TextAlign.center),
            SizedBox(
                height: 90.0,
                width: 250.0,
                child: TextField(
                  keyboardType: TextInputType.emailAddress,
                  obscureText: true,
                  enableSuggestions: false,
                  autocorrect: false,
                  textAlign: TextAlign.center,
                )),
            FloatingActionButton(
              child: Icon(Icons.send),
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => Menu()),
                );
              },
            )
          ],
        ),
      ),
    );
  }
}
