package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ionCaract extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ion_caract);

        TextView caractIon = (TextView) findViewById(R.id.caractIon);
        TextView e11 = (TextView) findViewById(R.id.e11);

        caractIon.setText("Caracterizarea lui Ion");

        StringBuilder stringBuilder = new StringBuilder();

        String finallyEseu = "  Romanul Ion ilustrează problematica pământului, în condiţiile satului ardelenesc de la nceputul secolului al XX-lea. Investigaţia narativă pune în evidenţă diverse aspecte ale lumii rurale: obiceiuri legate de marile momente ale existenței (naşterea, nunta, înmormântarea), relațiile sociale generate de diferențele economice sau culturale, relațiile de familie. "+
                "   Ion este protagonistul, un personaj monumental, realizat prin tehnica basoreliefului. Acesta devine exponent al țărănimii prin dorința de a avea pământ, dar este o individualitate prin mijloacele pe care le pune în slujba ambiţiei sale. Ţăran sărac şi harnic protagonistul o face pe Ana de ruşinea satului înainte de nuntă şi se dezumanizează treptat."+
                "   Personaj principal, eponim şi rotund, Ion este portretizat, fizic şi moral, prin tehnicile romanului realist. El este un personaj tipic, ce evoluează în imprejurări tipice. În jurul său se concentrează principalele întâmplări ale romanului, iar celelalte personajele sunt influenţate, într-un fel sau altul, de voinţa acestuia. "+
                "   Dacă la început satul ardelenesc, prin complexitatea sa, copleşeşte, pe măsură ce acțiunea se desfăşoară, Ion se detaşează de colectivitate şi trăieşte într-un tumult de stări şi de evenimente. Chiar din prima secvenţă a romanului (la horă), Ion este caracterizat direct într-un registru stilistic colocvial, drept „iute şi harnic ca mărsa\", voinic, dar sărac, ezitând între Ana şi Florica. Duplicitar, la horă, Ion ,,...strânge la piept pe Ana cu rnai multă gingăşie, dar şi mai prelung\". "+
                "   Relaţiile temporale şi spaţiale contribuie la caracterizarea personajului. Semnele unui destin tragic intervin, chiar de la începutul romanului, prin detalii, precum: „dealuri strâmtorate\", „podul bătrân de lemn\", „Cişmeaua -Mortului, unde picură veşnic apă de izvor\", „Râpele-Dracului\" şi „Pripasul pitit într-o scrântitură de coline\". Scriitorul realist insistă, prin detalii semnificative: „satul parcă e mort\". Titlurile primului şi ultimului capitol, „Începutul\" şi „Sfârşitul\", sugerează limitele acţiunii şi tragismul protagonistului. "+
                "   Caracterizarea indirectă, prin fapte, gesturi şi atitudini, este prezentă permanent de-a lungul operei. Astfel, sunt evidenţiate sentimentele lui Ion pe parcursul conflictelor pe care le antrenează lupta sa de a intra în stăpânirea pământurilor lui Vasile Baciu. Protagonistul oscilează între brutalitate, ipocrizie şi incântare. Seducerea Anei şi împingerea acesteia la  spânzurare indică o personalitate dominată de instincte. De altfel, George Călinescu arăta că: „nu din inteligenţă a ieşit ideea seducerii, ci din viclenie instinctuală, caracteristică oricărei ființe reduse\". \n"+
                "   Agresiv şi răzbunător, Ion se simte frustrat, aflând că Florica se mărită. Era „ca şi cum cineva i-ar fi furat cea mai bună şi cea mai mare dorinţă de pe pământ\". Odată stăpânit „glasul pământului\", devine dominant „glasul iubirii\", care va aduce sfârşitul brutal: Ion este ucis de George cu o sapă, fapt simbolic pentru ideea tragismului destinului.\n"+
                "   Înjosit de vorbele lui Vasile Baciu, care îl numeşte „sărăntoc\", „tâlhar\", „hoţ\" (caracterizare directă realizată de alte personaje), Ion hotărăşte să se răzbune. Deşi preotul îl dojeneşte, după bătaia cu George (caracterizare indirectă prin fapte), în biserică, la sfârşitul slujbei, acesta nu renunță la planurile sale. "+
                "   O scenă precum aceea a nunții pune în evidență, prin caracterizare indirectă, brutalitatea personajului: o priveste cu indiferență pe Ana, jucând doar cu Florica. Maria Herdelea îl consideră băiat „cumsecade\", „harnic\", „isteț\" (caracterizare directă), în timp ce preotul Belciug îi reproşează că este un „stricat, un bătăuş, un om de nimic...\" (caracterizare directă).\n"+
                "   Caracterizarea indirectă este şi procedeul care evidenţiază frământările sufleteşti, cu ajutorul monologului interior: „Las' că-i bună Anuţa\". Lăcomia de pământ şi dorinţa de răzbunare se manifestă în secvenţa epică, în care acesta intră cu plugul pe locul lui Simion Lungu, deoarece fusese înainte al Glanetaşilor (caracterizare indirectă). Având o funcție caracterizantă, numele personajului este emblematic, deoarece numele de Ion se regăseşte frecvent în onomastica rurală. Portretul moral al protagonistului este definit şi în relaţia cu pământul, în fața căruia se simte ca un „vierme\" şi pe care îl vede ca pe un „uriaş\", registrul stilistic fiind profund metaforic. Este semnificativă, scena în care acesta se apleacă şi sărută pământul: ,,...îşi coborî fruntea şi-şi lipi buzele cu voluptate de pământul ud\". Se poate vorbi astfel despre conflictul tragic dintre un ţăran şi o forţă pe care nu o poate domina: pământul-stihie, pământul-ibovnică, pământul-mamă, căci lui Ion pământul: „De pe atunci i-a fost mai drag decât o mamă\". \n"+
                "   În opinia mea, prăbuşirea lui Ion este generată de o anumită mentalitate: aceea, potrivit căreia familiile nu se fondează decât prin respectarea unor interese economice. Practic, Ion sfidează totul: „Nu mi-e frică nici de Dumnezeu\". \n"+
                "   În concluzie, acest personaj ilustrează drama deposedării (tatăl său pierduse pământul) şi a încercării violente de a înlocui „glasul iubirii\" cu „glasul pământului\" Ion va fi sfâşiat de forţe contrare.\n"
                ;
        stringBuilder.append(finallyEseu);
        e11.setText(stringBuilder.toString());
    }
}
