import 'package:flutter/material.dart';
import 'package:flutter_application_3/src/pages/opcion1.dart';
import 'package:flutter_application_3/src/pages/opcion2.dart';
import 'package:flutter_application_3/src/pages/opcion3.dart';
import 'package:flutter_application_3/src/pages/opcion4.dart';
import 'package:flutter_application_3/src/pages/opcion5.dart';
import 'package:flutter_application_3/src/pages/opcion6.dart';

class HomePage extends StatelessWidget {
  void pushRoute(BuildContext context) {
    Navigator.push(context,
        MaterialPageRoute(builder: (BuildContext context) => Opcio1Page()));
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Shop'),
        centerTitle: true,
        backgroundColor: Colors.green,
      ),
      body: Container(
          width: 900,
          height: 900,
          color: Colors.green,
          child: Column(
            children: <Widget>[
              Expanded(
                  child: Image(
                image: NetworkImage(
                    'https://www.kenresearch.com/blog/wp-content/uploads/2017/06/Global-Tea-Market-Research-Report.jpg'),
                alignment: Alignment.topCenter,
              )),
              Text("IF YOU DON'T BUY GTFO", style: TextStyle(fontSize: 25.0)),
              /*Expanded(
                child: Text('Si no compres ja ten pots anar', ),
              ),*/
              Expanded(
                  child: Table(
                children: <TableRow>[
                  TableRow(children: [
                    GestureDetector(
                        onTap: () => Navigator.push(
                            context,
                            MaterialPageRoute(
                                builder: (BuildContext context) =>
                                    Opcio2Page())),
                        child: Image.network(
                          //Rojo
                          'https://periodiconmx.com/wp-content/uploads/2020/07/te.jpg',
                          alignment: Alignment.bottomCenter,
                          height: 150,
                          width: 150,
                        )),
                    GestureDetector(
                        onTap: () => Navigator.push(
                            context,
                            MaterialPageRoute(
                                builder: (BuildContext context) =>
                                    Opcio1Page())),
                        child: Image.network(
                          //Azul
                          'https://vidayestilo.mx/wp-content/uploads/2020/09/te-azul-1024x683.jpg',
                          alignment: Alignment.bottomCenter,
                          height: 150,
                          width: 150,
                        )),
                    GestureDetector(
                        onTap: () => Navigator.push(
                            context,
                            MaterialPageRoute(
                                builder: (BuildContext context) =>
                                    Opcio3Page())),
                        child: Image.network(
                          //Naranja
                          'https://mejorconsalud.as.com/wp-content/uploads/2019/02/te-frio-canela-naranja.jpg',
                          alignment: Alignment.bottomCenter,
                          height: 150,
                          width: 150,
                        )),
                  ]),
                  TableRow(children: [
                    GestureDetector(
                        onTap: () => Navigator.push(
                            context,
                            MaterialPageRoute(
                                builder: (BuildContext context) =>
                                    Opcio4Page())),
                        child: Image.network(
                          //Green
                          'https://s1.eestatic.com/2015/03/12/cocinillas/cocinillas_17508326_115880898_1024x576.jpg',
                          alignment: Alignment.bottomCenter,
                          height: 150,
                          width: 150,
                        )),
                    GestureDetector(
                        onTap: () => Navigator.push(
                            context,
                            MaterialPageRoute(
                                builder: (BuildContext context) =>
                                    Opcio5Page())),
                        child: Image.network(
                          //Yellow
                          'https://saludteu.com/wp-content/uploads/2017/02/Beneficios-para-la-salud-de-beber-t%C3%A9-amarillo.jpg',
                          alignment: Alignment.bottomCenter,
                          height: 150,
                          width: 150,
                        )),
                    GestureDetector(
                        onTap: () => Navigator.push(
                            context,
                            MaterialPageRoute(
                                builder: (BuildContext context) =>
                                    Opcio6Page())),
                        child: Image.network(
                          //Pink
                          'https://mejorconsalud.as.com/wp-content/uploads/2013/11/infusion-de-rosas.jpg',
                          alignment: Alignment.bottomCenter,
                          height: 150,
                          width: 150,
                        )),
                  ]),
                ],
              ))
            ],
          )),
    );
  }
}

/*

                    GestureDetector(
                        onTap: () => Navigator.push(
                            context,
                            MaterialPageRoute(
                                builder: (BuildContext context) =>
                                    Opcio2Page())),
                        child: FlutterLogo(size: 150)),












Image.asset(
                        'tazul.jpg',
                        width: 150,
                        height: 150,
                      ),
                      */