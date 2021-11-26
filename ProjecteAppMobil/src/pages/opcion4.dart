import 'package:flutter/material.dart';

class Opcio4Page extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text('GREEN TEA'),
          backgroundColor: Colors.green.shade600,
        ),
        body: Column(
          children: <Widget>[
            Image.network(
              'https://s1.eestatic.com/2015/03/12/cocinillas/cocinillas_17508326_115880898_1024x576.jpg',
              height: 450,
              width: 450,
            ),
            Padding(
              padding: const EdgeInsets.all(0.0),
              child: Text(
                'The origin of GREEN tea takes place in PU-ERH Prefecture, district of Simao in southern Yunnan province. The larger leaves are pressed so that after storage which can last various years under controlled conditions, some specific bacterial strains transform the tea into what we call red tea. It has been scientifically proven that it lowers the level of fat in the blood, it is good for infections, helps digestion and strengthens the immune system.',
                style: TextStyle(fontSize: 15),
              ),
            )
          ],
        ));
  }
}
