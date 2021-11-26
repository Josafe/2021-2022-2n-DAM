import 'package:flutter/material.dart';

class Opcio3Page extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text('ORANGE TEA'),
          backgroundColor: Colors.orange,
        ),
        body: Column(
          children: <Widget>[
            Image.network(
              'https://mejorconsalud.as.com/wp-content/uploads/2019/02/te-frio-canela-naranja.jpg',
              height: 450,
              width: 450,
            ),
            Padding(
              padding: const EdgeInsets.all(0.0),
              child: Text(
                'The origin of ORANGE tea takes place in PU-ERH Prefecture, district of Simao in southern Yunnan province. The larger leaves are pressed so that after storage which can last various years under controlled conditions, some specific bacterial strains transform the tea into what we call red tea. It has been scientifically proven that it lowers the level of fat in the blood, it is good for infections, helps digestion and strengthens the immune system.',
                style: TextStyle(fontSize: 15),
              ),
            )
          ],
        ));
  }
}
