package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class harapCaract extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harap_caract);


        TextView caractHarapAlb = (TextView) findViewById(R.id.caractHarapAlb);
        TextView e2 = (TextView) findViewById(R.id.e2);

        caractHarapAlb.setText("Caracterizarea lui Harap-Alb");

        StringBuilder stringBuilder = new StringBuilder();

        String finallyEseu = "  Basmul Povestea lui Harap-Alb este o oglindire a vieții în moduri fabuloase, este mitologie, etică, filosofie, observaţie morală, în care „eroii nu sunt numai oameni, ci şi anume fiinţe himerice, animale\", care au „psihologia și sociologia lor misterioasă\" (G. Călinescu). Criticul George Munteanu consideră textul „un veritabil bildungsroman fantastic al epocii noastre\", deoarece Harap-Alb, personajul principal al operei, trebuie să străbată un drum al inițierii, să acumuleze experienţă, să se formeze pentru viaţă în lupta cu forţele malefice şi să obțină o înțelepciune ca să capteze filosofia despre viaţă, adevăr, dreptate, iubire, prietenie.\n" +
                "   Personajul este reliefat prin diverse modalităţi detaliate: caracterizare directă (făcută de scriitor sau de alte personaje) sau indirectă, prin propriile acţiuni, cuvinte, comportament, gesturi, precum și prin modalităţile de expunere-naraţiune, descrie, dialog, care au rolul de a individualiza.\n"+
                "   Harap-Alb se hotărăște să-si încerce norocul, după ce fraţii lui n-au izbutit să treacă de proba-cursă pe care le-o întinsese tatăl lor ca să le verifice curajul. Această încercare a fost plănuită în scopul ajungerii la fratele său, Verde Împărat, pentru a împărăţi, întrucât acesta avea numai fete.\n"+
                "   Fiul cel mai mic al împăratului are un destin, pe care Sfânta Duminică îl dezvăluie: „puţin mai este şi o să ajungi împărat cum n-a mai fost altul pe fața pământului\", „ai să poţi să te duci unde n-au putut merge fraţii tăi\", „pentru că ție ți-a fost scris de sus să-ţi fie dată această cinste\" (caracterizare directă). "+
                "   Optimist, plin de încredere în sine că va izbuti în ceea ce gândea, se decide să plece la unchiul său, nu înainte de a-i cere tatălui său calul, armele şi hainele cu care a fost mire, deoarece aşa fusese sfătuit de Sfânta Duminică, drept urmare a milosteniei față de aceasta, trăsătură recunoscută de bătrână (caracterizare directă). Caracterul vechi al lucrurilor sugerează faptul că eroul trebuie să le „reactualizeze virtuțile\" (Vasile Lovinescu).\n"+
                "   După ce-l înduplecă pe tatăl său, alege calul năzdrăvan, întinzându-i o tavă cu jăratec. Se dovedeşte a fi impulsiv atunci când loveşte calul slăbănog ce se repezise la tavă, (caracterizare indirectă), dar care se va transforma ulterior într-un bun pedagog pentru fecior. Vasile Lovinescu este de părere că zborul calului are un sens religios, realizând o „cruce cosmică\". Tot funcţie de caracterizare indirectă o deţine secvenţa narativă în care, la pod, tatăl îmbrăcat în urs îi iese în cale, încercând să-l sperie, dar feciorul se năpusteşte asupra lui fără frică, dovedindu-şi curajul în luptă. Aici, el se desparte de familie, de protecţia oferită de tatăl său, care-l sfătuieşte să se ferească „de omul roş, dar mai ales de cel spân\" şi-i dăruieşte o piele de urs. Podul poate fi considerat, pe de altă parte, un simbol al trecerii între două lumi.\n"+
                "   Harap-Alb dă ascultare vorbelor tatălui său şi încercă să se ferească de pericole însă este păcălit în final de Spân, acceptând să intre in fântână. Acum este momentul în care ajunge robul propriilor sale greșeli, prin ,,întovărășirea cu răul\", care-i cere să jure credință și-l botează Harap-Alb. Acest nume (caracterizare prin onomastică) evidențiază dubla personalitate a protagonistului supus, având o identitate reală (fiul de crai) și una aparentă (slugă a spânului). Numele complet constituie un oximoron, care, prin contrastul alb-negru, sugerează armonizarea defectelor și a calităților umane. Conform opiniei criticului vasile Lovinescu, alăturarea negrului cu albul ar simboliza unire celor doua principii, Ying-Yang.\n"+
                "   În sufletul feciorului se instaleză îngrijorarea, căința pentru nesocotința sfatului părintesc. Ajunși la curtea Împăratului Verde, Spânul joacă rolul mai departe. Fetele împăratului se îndoiesc de apropierea de rudenie cu Spînul pe care-l cred crud față de Harap-Alb, mai ales că acesta ,,are o înfățișare mult mai plăcută și seamănă a fi mult mai omenos\" (caracterizare directă).\n"+
                "   Fiul de crai este supus mai multor probe, care sunt, de fapt, ritualuri de inițiere, prin care acesta trece de la sacru la profan. Prima misiune este aducerea ,,sălăților\" din grădina ursului, încercare ce pare imposibilă, căci el nu are puteri supranaturale, precum Făt-Frumos din basmul popular, dar pe care o țndelinește cu ajutorul Sfintei Duminici și a blănii de urs de la tatăl său, căștigând astfel ,,elixirul de viață lungă, aspectul vegetal\" (Vasile Lovinescu). În cea de-a doua expediție, eroul trebuie să aducă cerbul cu pietre prețioase, obținând ,,piatra filosofală, aspectul mineral\", în opinia aceluiași critic.\n"+
                "   Trimis să o aducă pe fata lui Roș Împărat, Harap-Alb ocrotește în drum nunta de furnici, primind în dar o aripă ce-i poate servi la nevoie; ajută albinele, făcându-le un ,,buștihan\" pentru care primește, de asemenea, o aripă. Spiritul mucălit nu-i lipsește lui Harap-Alb, atunci când îi întălnește pe cei cinci monștri, personaje alegorice, pe care el, cu o intuiție admirativă le recunoaște a fi: Gerilă, Flămânzilă, Setilă, Ochilă, Păsări-Lăți-Lungilă și pe care-i câștigă ca aliați. Aceștia au un rol foarte important, deoarece îl ajută pe fiul craiului în momente cruciale, câștigând ,,bătăliile\" pentru el.\n"+
                "   Dialogul cu omul Roș îl frământă, știe că a dus-o cu Spânul ,,câine-câinește\", dar că îl așteaptă ceva mai cumplit. Caracterizați direct de Împăratul-Roș drept ,,niște golani\" care îndrăznesc să-i ceară fata, aceștia sunt supuși unor probe, pe care năzdrăvanii le vor trece cu succes, reușind să câștige fata împăratului, care își ia cu ea ,,trei smicele de măr\". Un mare spectacol îl reprezintă secvențele alegerii ,,seminței de mac\" din ,,nisipul maruntel\", când eroul este ajutat de furnici și cea a identificării fetei de împărat, când îi vine în ajutor crăiasa albinelor.\n"+
                "   Ajungând la împărăție, îl dă în vileag pe Spân, care se repede ,,ca un câine turbat și retează capul lui Harap-Alb\". Fata de împărat îi pune capul la loc, îl înconjoară ,,cu cele trei smicele de măr dulce\", îl stropește cu apă vie și-l trezește, acesta simțindu-se ca după un somn greu. Calul năzdrăvan îl pedepsește pe Spân, ridicându-l în cer și dându-i drumul de acolo.\n"+
                "   Moartea fizică îl eliberează pe Harap-Alb de jurământ (protagonistul îi jurase ,,credință și supunere întru toate\" Spânului, până când ,,îi muri și iar îi învie\", pentru a fi eliberat de Spân din fântână), el regăsindu-și starea de puritate de la început. Dobândirea cunoștințelor și a experienței este, în definitiv, ,,tot vin Spânului\". Răul are o funcție morală pentru că, prin el, feciorul cunoaște lumea. Vorbele calului subliniază toate acestea: ,,Și unii ca aceștia sunt trebuitori pe lume câteodată, pentru că fac pe oameni să prindă la minte\".\n"+
                "   În final, primind binecuvântarea și împărăția de la Verde Împărat, Harap-Alb și fata Împăratului Roș au făcut o nuntă mare. Deznodământul este specific basmului (popular sau cult)."+
                "   Criticul Vasile Lovinescu, care interpretează atât poveștile, cât și basmul, lansează o perspectivă de abordare mitica, inițiatică: ,,Povestea lui Harap-Alb conține un scenariu al inițierii eroului în scopul accederii la împărăție\". Victoria lui Harap-Alb și a tovarășilor săi nu este una solitară, ci reprezintă biruința fraternității spirituale asupra individualismului omenesc.\n"+
                "   În opinia mea, Harap-Alb parcurge o fascinantă aventură inițiatică, depășind limitele realului și ale imposibilului. El își învinge, în fond, propria neputință de a stapâni timpul și spațiul, dar învinge și forțele demonice (Spânul, Împăratul Roș).\n"+
                "   În concluzie, ilustrând forțele binelui, protagonistul împrumută din înțelepciunea lumii în evoluția sa. Experiențele parcurse de erou evidențiază un destin excepțional.\n"
                ;

        stringBuilder.append(finallyEseu);
        e2.setText(stringBuilder.toString());
    }
}
