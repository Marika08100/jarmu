# jarmu
Írj SmallVehicle interfészt, ami egy haladhatItt metódust deklarál.

A metódus egy logikai értékkel térjen vissza (haladhat -e ezen az úton a gépjármű),

és egy egész számot (sebességet) kérjen paraméterként.
## Készíts egy absztrakt Vehicle osztályt.
Egy járműnek legyen 
- aktuális sebessége (int)
-  rendszáma.

Az aktuális sebesség látszódjon a leszármazott osztályokban is (használd a lehető legszűkebb láthatóságot),

míg a rendszám adattagot csak ebből az osztályból lehessen elérni.

Írj konstruktort két paraméterrel, ami beállítja az adattagokat.
Készíts egy gyorshajtottE absztrakt metódust, ami egy sebességkorlátot (int) kér paraméternek,
és logikai értékkel tér vissza attól függően, hogy az adott jármű gyorshajtott -e.

Készíts toString metódust, ami az alábbi módon alakítja szöveges formára az objektumot: "rendszam - X km/h" (ahol rendszam a jármű rendszáma, X pedig az akutális
sebessége)
## Kézsíts egy Scooter osztályt,
ami a Vehicle osztályból származik és implementálja a SmallVehicle interfészt.
- A robogónak legyen egy maximális sebesség adattagja.
- A robogó konstruktora a rendszámot, az aktuális sebességet és a maximális sebességet kérje el paraméterül, és ez alapján hozza létre az objektumot.
- A gyorshajtottE metódus nézze meg, hogy a jármű aktuális sebessége fölötte van -e a
paraméterként kapott korlátnak, és ennek megfelelően térjen vissza logikai értékkel.
- A haladhatItt metódust hamis értékkel térjen vissza, ha a robogó maximális sebessége
nagyobb, mint a kapott paraméter, ellenkező esetben igaz legyen a visszatérés.
- Bővítsd ki az örökölt toString metódust, hogy az alábbiakat adja vissza: "Scooter:
rendszam - X km/h" (ahol rendszam a jármű rendszáma, X pedig az akutális sebessége) Használd fel az ősosztály toString metódusát is!
## Kézsíts egy AudiS8 osztályt, ami a Vehicle osztályból származik.
– Az Audinak legyen egy lezerblokkolo (boolean) paramétere. Konstruktora a rendszámát, az aktuális sebességét kérje el, és hogy van -e lézerblokkolója, és ezek alapján
hozza létre az objektumot.

– A gyorshajtottE metódus nézze meg, hogy a jármű aktuális sebessége fölötte van -e
a paraméterként kapott korlátnak, és ennek megfelelően térjen vissza logikai értékkel.
Ha a jármű rendelkezik lézerblokkolóval, úgy ehelyett mindig hamissal térjen vissza.

– Bővítsd ki az örökölt toString metódust, hogy az alábbiakat adja vissza: "Audi: rendszam - X km/h" (ahol rendszam a jármű rendszáma, X pedig az akutális sebessége).
Használd fel az ősosztály toString metódusát is!
