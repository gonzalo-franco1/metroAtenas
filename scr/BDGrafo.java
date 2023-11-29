import java.util.HashMap;

public class BDGrafo {
    private HashMap<String, NodoEstacion> estaciones = new HashMap<String, NodoEstacion>();
    // Estaciones linea 1
    private NodoEstacion piraeus;
    private NodoEstacion faliro;
    private NodoEstacion moschato;
    private NodoEstacion kallithea;
    private NodoEstacion tavros;
    private NodoEstacion petralona;
    private NodoEstacion thissio;
    private NodoEstacion victoria;
    private NodoEstacion aghiosNikolaos;
    private NodoEstacion katoPatissia;
    private NodoEstacion aghiosEleftherios;
    private NodoEstacion anoPatissia;
    private NodoEstacion perissos;
    private NodoEstacion pefkakia;
    private NodoEstacion neaIonia;
    private NodoEstacion iraklio;
    private NodoEstacion irini;
    private NodoEstacion neratziotissa;
    private NodoEstacion maroussi;
    private NodoEstacion kat;
    private NodoEstacion kifissia;

    // Estaciones linea 2
    private NodoEstacion aghiosAntonios;
    private NodoEstacion attiki;
    private NodoEstacion sepolia;
    private NodoEstacion larissaStation;
    private NodoEstacion metaxourghio;
    private NodoEstacion omonia;
    private NodoEstacion panepistimio;
    // estacion Syntagma
    private NodoEstacion akropoli;
    private NodoEstacion sygrouFix;
    private NodoEstacion neosKosmos;
    private NodoEstacion aghiosIoannis;
    private NodoEstacion dafni;
    private NodoEstacion aghiosDimitriosAlexandrosPanagouli;

    // estacion linea 3
    private NodoEstacion egaleo;
    private NodoEstacion eleonas;
    private NodoEstacion kerameikos;
    private NodoEstacion monastiraki;
    private NodoEstacion syntagma;
    private NodoEstacion evangelismos;
    private NodoEstacion megaroMousikis;
    private NodoEstacion ambelokipi;
    private NodoEstacion panormou;
    private NodoEstacion katehaki;
    private NodoEstacion ethnikiAmyna;
    private NodoEstacion holargos;
    private NodoEstacion nomismatokopio;
    private NodoEstacion aghiaParaskevi;
    private NodoEstacion halandri;
    private NodoEstacion pallini;
    private NodoEstacion peaniaKantza;
    private NodoEstacion koropi;
    private NodoEstacion airport;

    /**
     * Constructor
     */
    public BDGrafo() {
        // Estaciones linea 2
        aghiosAntonios = new NodoEstacion("Aghios Antonios", 38.0061040, 23.6997301, 0);
        estaciones.put("Aghios Antonios", aghiosAntonios);

        sepolia = new NodoEstacion("Sepolia", 38.0026101, 23.7140398, 0);
        estaciones.put("Sepolia", sepolia);

        attiki = new NodoEstacion("Attiki", 37.9995283, 23.7228390, 3);
        estaciones.put("Attiki", attiki);

        larissaStation = new NodoEstacion("Larissa Station", 37.9922822, 23.7207199, 0);
        estaciones.put("Larissa Station", larissaStation);

        metaxourghio = new NodoEstacion("Metaxourghio", 37.9858525, 23.7213796, 0);
        estaciones.put("Metaxourghio", metaxourghio);

        omonia = new NodoEstacion("Omonia", 37.9841128, 23.7279901, 3);
        estaciones.put("Omonia", omonia);

        panepistimio = new NodoEstacion("Panepistimio", 37.9803554, 23.7330199, 0);
        estaciones.put("Panepistimio", panepistimio);

        // Syntagma
        akropoli = new NodoEstacion("Akropoli", 37.9688593, 23.7295312, 0);
        estaciones.put("Akropoli", akropoli);

        sygrouFix = new NodoEstacion("Sygrou-Fix", 37.9646255, 23.7268179, 0);
        estaciones.put("Sygrou-Fix", sygrouFix);

        neosKosmos = new NodoEstacion("Neos Kosmos", 37.9576705, 23.7283724, 0);
        estaciones.put("Neos Kosmos", neosKosmos);

        aghiosIoannis = new NodoEstacion("Aghios Ioannis", 37.9564304, 23.7346855, 0);
        estaciones.put("Aghios Ioannis", aghiosIoannis);

        dafni = new NodoEstacion("Dafni", 37.9495601, 23.7372326, 0);
        estaciones.put("Dafni", dafni);

        aghiosDimitriosAlexandrosPanagouli = new NodoEstacion("Aghios Dimitrios-Alexandros Panagoulis",
                37.9404334,
                23.7407042, 0);
        estaciones.put("Aghios Dimitrios-Alexandros Panagoulis", aghiosDimitriosAlexandrosPanagouli);

        // Estaciones linea 1
        piraeus = new NodoEstacion("Piraeus", 37.9481439, 23.6434303, 0);
        estaciones.put("Piraeus", piraeus);

        faliro = new NodoEstacion("Faliro", 37.9450534, 23.6652663, 0);
        estaciones.put("Faliro", faliro);

        moschato = new NodoEstacion("Moschato", 37.9552355, 23.6802925, 0);
        estaciones.put("Moschato", moschato);

        kallithea = new NodoEstacion("Kallithea", 37.9604095, 23.6969304, 0);
        estaciones.put("Kallithea", kallithea);

        tavros = new NodoEstacion("Tavros", 37.9624859, 23.7034811, 0);
        estaciones.put("Tavros", tavros);

        petralona = new NodoEstacion("Petralona", 37.9683470, 23.7090441, 0);
        estaciones.put("Petralona", petralona);

        thissio = new NodoEstacion("Thissio", 37.9767658, 23.7203289, 0);
        estaciones.put("Thissio", thissio);

        // monastiraki
        // omonia

        victoria = new NodoEstacion("Victoria", 37.9931743, 23.7301714, 0);
        estaciones.put("Victoria", victoria);

        // attiki

        aghiosNikolaos = new NodoEstacion("Aghios Nikolaos", 38.0069885, 23.7277049, 0);
        estaciones.put("Aghios Nikolaos", aghiosNikolaos);

        katoPatissia = new NodoEstacion("Kato Patissia", 38.0119232, 23.7286475, 0);
        estaciones.put("Kato Patissia", katoPatissia);

        aghiosEleftherios = new NodoEstacion("Aghios Eleftherios", 38.0200358, 23.7317451, 0);
        estaciones.put("Aghios Eleftherios", aghiosEleftherios);

        anoPatissia = new NodoEstacion("Ano Patissia", 38.0238389, 23.7360222, 0);
        estaciones.put("Ano Patissia", anoPatissia);

        perissos = new NodoEstacion("Perissos", 38.0328448, 23.7447123, 0);
        estaciones.put("Perissos", perissos);

        pefkakia = new NodoEstacion("Pefkakia", 38.0371241, 23.7501217, 0);
        estaciones.put("Pefkakia", pefkakia);

        neaIonia = new NodoEstacion("Nea Ionia", 38.0415099, 23.7548578, 0);
        estaciones.put("Nea Ionia", neaIonia);

        iraklio = new NodoEstacion("Iraklio", 38.0462663, 23.7660370, 0);
        estaciones.put("Iraklio", iraklio);
        irini = new NodoEstacion("Irini", 38.0433749, 23.7830457, 0);
        estaciones.put("Irini", irini);

        neratziotissa = new NodoEstacion("Neratziotissa", 38.0447682, 23.7941064, 0);
        estaciones.put("Neratziotissa", neratziotissa);

        maroussi = new NodoEstacion("Maroussi", 38.0562402, 23.8049410, 0);
        estaciones.put("Maroussi", maroussi);

        kat = new NodoEstacion("KAT", 38.0655977, 23.8039921, 0);
        estaciones.put("KAT", kat);

        kifissia = new NodoEstacion("Kifissia", 38.0736082, 23.8082244, 0);
        estaciones.put("Kifissia", kifissia);

        // Estaciones linea 3
        egaleo = new NodoEstacion("Egaleo", 37.9914342, 23.6818195, 0);
        estaciones.put("Egaleo", egaleo);

        eleonas = new NodoEstacion("Eleonas", 37.9878662, 23.6940002, 0);
        estaciones.put("Eleonas", eleonas);

        kerameikos = new NodoEstacion("Kerameikos", 37.9786654, 23.7111631, 0);
        estaciones.put("Kerameikos", kerameikos);

        monastiraki = new NodoEstacion("Monastiraki", 37.9760959, 23.7256297, 3);
        estaciones.put("Monastiraki", monastiraki);

        syntagma = new NodoEstacion("Syntagma", 37.9755029, 23.7357427, 3);
        estaciones.put("Syntagma", syntagma);

        evangelismos = new NodoEstacion("Evangelismos", 37.9761258, 23.7471036, 0);
        estaciones.put("Evangelismos", evangelismos);

        megaroMousikis = new NodoEstacion("Megaro Mousikis", 37.9790317, 23.7530087, 0);
        estaciones.put("Megaro Mousikis", megaroMousikis);

        ambelokipi = new NodoEstacion("Ambelokipi", 37.9871933, 23.7576802, 0);
        estaciones.put("Ambelokipi", ambelokipi);

        panormou = new NodoEstacion("Panormou", 37.9932117, 23.7635768, 0);
        estaciones.put("Panormou", panormou);

        katehaki = new NodoEstacion("Katehaki", 37.9937402, 23.7767641, 0);
        estaciones.put("Katehaki", katehaki);

        ethnikiAmyna = new NodoEstacion("Ethniki Amyna", 37.9991840, 23.7844745, 0);
        estaciones.put("Ethniki Amyna", ethnikiAmyna);

        holargos = new NodoEstacion("Holargos", 38.0049099, 23.7947085, 0);
        estaciones.put("Holargos", holargos);

        nomismatokopio = new NodoEstacion("Nomismatokopio", 38.0090991, 23.8057757, 0);
        estaciones.put("Nomismatokopio", nomismatokopio);

        aghiaParaskevi = new NodoEstacion("Aghia Paraskevi", 38.0171296, 23.8124844, 0);
        estaciones.put("Aghia Paraskevi", aghiaParaskevi);

        halandri = new NodoEstacion("Halandri", 38.0217116, 23.8207549, 0);
        estaciones.put("Halandri", halandri);

        pallini = new NodoEstacion("Pallini", 38.0057615, 23.8696043, 0);
        estaciones.put("Pallini", pallini);

        peaniaKantza = new NodoEstacion("Peania-Kantza", 37.9841986, 23.8699253, 0);
        estaciones.put("Peania-Kantza", peaniaKantza);

        koropi = new NodoEstacion("Koropi", 37.9130116, 23.8958108, 0);
        estaciones.put("Koropi", koropi);

        airport = new NodoEstacion("Airport", 37.9369769, 23.9448074, 0);
        estaciones.put("Airport", airport);

        // Conexiones:
        // Conexiones Linea 1
        piraeus.addConexion(new Conexion(piraeus, faliro, 1, 4));

        faliro.addConexion(new Conexion(faliro, moschato, 1, 3));
        faliro.addConexion(new Conexion(faliro, piraeus, 1, 3));

        moschato.addConexion(new Conexion(moschato, kallithea, 1, 2));
        moschato.addConexion(new Conexion(moschato, faliro, 1, 3));

        kallithea.addConexion(new Conexion(kallithea, tavros, 1, 2));
        kallithea.addConexion(new Conexion(kallithea, moschato, 0, 3));

        piraeus.addConexion(new Conexion(piraeus, faliro, 1, 4));
        faliro.addConexion(new Conexion(faliro, moschato, 1, 3));
        moschato.addConexion(new Conexion(moschato, kallithea, 1, 2));
        kallithea.addConexion(new Conexion(kallithea, tavros, 1, 2));
        tavros.addConexion(new Conexion(tavros, petralona, 1, 2));
        petralona.addConexion(new Conexion(petralona, thissio, 1, 2));
        thissio.addConexion(new Conexion(thissio, monastiraki, 1, 2));
        victoria.addConexion(new Conexion(victoria, attiki, 1, 3));

        aghiosNikolaos.addConexion(new Conexion(aghiosNikolaos, katoPatissia, 1, 2));
        katoPatissia.addConexion(new Conexion(katoPatissia, aghiosEleftherios, 1, 2));
        aghiosEleftherios.addConexion(new Conexion(aghiosEleftherios, anoPatissia, 1, 1));
        anoPatissia.addConexion(new Conexion(anoPatissia, perissos, 1, 3));
        perissos.addConexion(new Conexion(perissos, pefkakia, 1, 1));
        pefkakia.addConexion(new Conexion(pefkakia, neaIonia, 1, 2));
        neaIonia.addConexion(new Conexion(neaIonia, iraklio, 1, 2));
        iraklio.addConexion(new Conexion(iraklio, irini, 1, 3));
        irini.addConexion(new Conexion(irini, neratziotissa, 1, 2));
        neratziotissa.addConexion(new Conexion(neratziotissa, maroussi, 1, 3));
        maroussi.addConexion(new Conexion(maroussi, kat, 1, 2));
        kat.addConexion(new Conexion(kat, kifissia, 1, 2));

        kifissia.addConexion(new Conexion(kifissia, kat, 1, 2));
        kat.addConexion(new Conexion(kat, maroussi, 1, 3));
        maroussi.addConexion(new Conexion(maroussi, neratziotissa, 1, 3));
        neratziotissa.addConexion(new Conexion(neratziotissa, irini, 1, 2));
        irini.addConexion(new Conexion(irini, iraklio, 1, 2));
        iraklio.addConexion(new Conexion(iraklio, neaIonia, 1, 3));
        neaIonia.addConexion(new Conexion(neaIonia, pefkakia, 1, 1));
        pefkakia.addConexion(new Conexion(pefkakia, perissos, 1, 2));
        perissos.addConexion(new Conexion(perissos, anoPatissia, 1, 2));
        anoPatissia.addConexion(new Conexion(anoPatissia, aghiosEleftherios, 1, 2));
        aghiosEleftherios.addConexion(new Conexion(aghiosEleftherios, katoPatissia, 1, 2));
        katoPatissia.addConexion(new Conexion(katoPatissia, aghiosNikolaos, 1, 1));
        aghiosNikolaos.addConexion(new Conexion(aghiosNikolaos, attiki, 1, 2));

        victoria.addConexion(new Conexion(victoria, omonia, 1, 2));
        thissio.addConexion(new Conexion(thissio, petralona, 1, 3));
        petralona.addConexion(new Conexion(petralona, tavros, 1, 2));
        tavros.addConexion(new Conexion(tavros, kallithea, 1, 1));
        kallithea.addConexion(new Conexion(kallithea, moschato, 1, 3));
        moschato.addConexion(new Conexion(moschato, faliro, 1, 3));
        faliro.addConexion(new Conexion(faliro, piraeus, 1, 3));

        // Conexiones Linea 2
        aghiosAntonios.addConexion(new Conexion(aghiosAntonios, sepolia, 2, 2));

        sepolia.addConexion(new Conexion(sepolia, attiki, 2, 1));
        sepolia.addConexion(new Conexion(sepolia, aghiosAntonios, 2, 2));

        attiki.addConexion(new Conexion(attiki, larissaStation, 2, 2));
        attiki.addConexion(new Conexion(attiki, sepolia, 2, 2));
        attiki.addConexion(new Conexion(attiki, aghiosNikolaos, 1, 2));
        attiki.addConexion(new Conexion(attiki, victoria, 1, 3));

        larissaStation.addConexion(new Conexion(larissaStation, metaxourghio, 2, 1));
        larissaStation.addConexion(new Conexion(larissaStation, attiki, 2, 1));

        metaxourghio.addConexion(new Conexion(metaxourghio, omonia, 2, 2));
        metaxourghio.addConexion(new Conexion(metaxourghio, larissaStation, 2, 2));

        omonia.addConexion(new Conexion(omonia, panepistimio, 2, 1));
        omonia.addConexion(new Conexion(omonia, metaxourghio, 2, 1));
        omonia.addConexion(new Conexion(omonia, victoria, 1, 2));
        omonia.addConexion(new Conexion(omonia, monastiraki, 1, 3));

        panepistimio.addConexion(new Conexion(panepistimio, syntagma, 2, 2));
        panepistimio.addConexion(new Conexion(panepistimio, omonia, 2, 1));

        akropoli.addConexion(new Conexion(akropoli, sygrouFix, 2, 2));
        akropoli.addConexion(new Conexion(akropoli, syntagma, 2, 2));

        sygrouFix.addConexion(new Conexion(sygrouFix, neosKosmos, 2, 1));
        sygrouFix.addConexion(new Conexion(sygrouFix, akropoli, 2, 1));

        neosKosmos.addConexion(new Conexion(neosKosmos, aghiosIoannis, 2, 1));
        neosKosmos.addConexion(new Conexion(neosKosmos, sygrouFix, 2, 2));

        aghiosIoannis.addConexion(new Conexion(aghiosIoannis, dafni, 2, 2));
        aghiosIoannis.addConexion(new Conexion(aghiosIoannis, neosKosmos, 2, 1));

        dafni.addConexion(new Conexion(dafni, aghiosDimitriosAlexandrosPanagouli, 2, 2));
        dafni.addConexion(new Conexion(dafni, aghiosIoannis, 2, 2));

        aghiosDimitriosAlexandrosPanagouli
                .addConexion(new Conexion(aghiosDimitriosAlexandrosPanagouli, dafni, 2, 1));

        // Conexiones Linea 3
        egaleo.addConexion(new Conexion(egaleo, eleonas, 3, 2));

        eleonas.addConexion(new Conexion(eleonas, kerameikos, 3, 2));
        eleonas.addConexion(new Conexion(eleonas, egaleo, 3, 2));

        kerameikos.addConexion(new Conexion(kerameikos, monastiraki, 3, 2));
        kerameikos.addConexion(new Conexion(kerameikos, eleonas, 3, 2));

        monastiraki.addConexion(new Conexion(monastiraki, syntagma, 3, 3));
        monastiraki.addConexion(new Conexion(monastiraki, kerameikos, 3, 3));
        monastiraki.addConexion(new Conexion(monastiraki, omonia, 1, 2));
        monastiraki.addConexion(new Conexion(monastiraki, thissio, 1, 1));

        syntagma.addConexion(new Conexion(syntagma, evangelismos, 3, 1));
        syntagma.addConexion(new Conexion(syntagma, monastiraki, 3, 2));
        syntagma.addConexion(new Conexion(syntagma, panepistimio, 2, 2));
        syntagma.addConexion(new Conexion(syntagma, akropoli, 2, 1));

        evangelismos.addConexion(new Conexion(evangelismos, megaroMousikis, 3, 1));
        evangelismos.addConexion(new Conexion(evangelismos, syntagma, 3, 2));

        megaroMousikis.addConexion(new Conexion(megaroMousikis, ambelokipi, 3, 2));
        megaroMousikis.addConexion(new Conexion(megaroMousikis, evangelismos, 3, 2));

        ambelokipi.addConexion(new Conexion(ambelokipi, panormou, 3, 1));
        ambelokipi.addConexion(new Conexion(ambelokipi, megaroMousikis, 3, 1));

        panormou.addConexion(new Conexion(panormou, katehaki, 3, 2));
        panormou.addConexion(new Conexion(panormou, ambelokipi, 3, 2));

        katehaki.addConexion(new Conexion(katehaki, ethnikiAmyna, 3, 2));
        katehaki.addConexion(new Conexion(katehaki, panormou, 3, 1));

        ethnikiAmyna.addConexion(new Conexion(ethnikiAmyna, holargos, 3, 2));
        ethnikiAmyna.addConexion(new Conexion(ethnikiAmyna, katehaki, 3, 2));

        holargos.addConexion(new Conexion(holargos, nomismatokopio, 3, 1));
        holargos.addConexion(new Conexion(holargos, ethnikiAmyna, 3, 1));

        nomismatokopio.addConexion(new Conexion(nomismatokopio, aghiaParaskevi, 3, 2));
        nomismatokopio.addConexion(new Conexion(nomismatokopio, holargos, 3, 2));

        aghiaParaskevi.addConexion(new Conexion(aghiaParaskevi, halandri, 3, 2));
        aghiaParaskevi.addConexion(new Conexion(aghiaParaskevi, nomismatokopio, 3, 2));

        halandri.addConexion(new Conexion(halandri, pallini, 3, 6));
        halandri.addConexion(new Conexion(halandri, aghiaParaskevi, 3, 2));

        pallini.addConexion(new Conexion(pallini, peaniaKantza, 3, 3));
        pallini.addConexion(new Conexion(pallini, halandri, 3, 7));

        peaniaKantza.addConexion(new Conexion(peaniaKantza, koropi, 3, 6));
        peaniaKantza.addConexion(new Conexion(peaniaKantza, pallini, 3, 2));

        koropi.addConexion(new Conexion(koropi, airport, 3, 5));
        koropi.addConexion(new Conexion(koropi, peaniaKantza, 3, 6));

        airport.addConexion(new Conexion(airport, koropi, 3, 6));
    }

    /**
     * @param nombre el nombre de la estación que se quiere obtener
     * @return el objeto estación cuyo nombre coincide con el suministrado
     */
    public NodoEstacion getEstacion(String nombre) {
        return estaciones.get(nombre);
    }

    public HashMap<String, NodoEstacion> getEstaciones() {
        return estaciones;
    }

    /**
     * Metodo que retorna un array con el nombre de las estaciones.
     * @return Array de strings con el nombre de una estacion en cada posicion.
     */
    public String[] getArrayEstaciones() {
        String[] arraySolucion = new String[estaciones.size()];
        int i = 0;
        for (NodoEstacion estacion : estaciones.values()) {
            arraySolucion[i] = estacion.getNombre();
            i++;
        }
        return arraySolucion;
    }

    public String toString() {
        String solucion = "---------Contenidos del grafo----------\n";
        for (NodoEstacion estacion : estaciones.values()) {
            solucion += estacion.toStringLong() + "\n";
        }
        return solucion;
    }
}
