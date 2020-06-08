package com.example.esee4bac;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.text.DecimalFormat;

import javax.net.ssl.HttpsURLConnection;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.esee4bac.R;

import java.io.File;
public class harapTema extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harap_tema);


        TextView eseuHarapAlb = (TextView) findViewById(R.id.eseuHarapAlb);
        TextView e1 = (TextView) findViewById(R.id.e1);

        eseuHarapAlb.setText("Povestea lui Harap-Alb, de Ion Creanga");

        StringBuilder stringBuilder = new StringBuilder();

        String finallyEseu = "  Despre raporturile dintre opera lui Ion Creangă și folclor s-a discutat mult, încât de la sosirea sa la Junimea. Asupra acestui aspect s-au pronunțat G.Panu, T.Maiorescu, G.Ibrăileanu, G.Călinescu: \"Ion Creangă este un mare prozator și numai cititorul de mare rafinament artistic il poate gusta cum trebuie.\" (Viața lui Ion Creangă). Observația criticului este valabilă mai ales cu privire la \"Povestea lui Harap-Alb\". Basmul a apărut la 1 august 1877 în \"Convorbiri literare\", fiind reprodus în același an în \"Timpul\". Basmul e apreciat pentru \"ritmul trepidant al narațiunii, gigantescul viziunii, umor\" (V.Streinu), e o sinteză de \"realism și fabulos\"(G.Călinescu). Un prim argument ce ilustrează caracterul realist al operei este descrierea impersonală: mediul și personajele sunt descrise impersonal (obiectiv):\"Amu cică era odată într-o țară un crai, care avea trei feciori. Și craiul acela mai avea un frate mai mare, care era împărat într-o țară, mai depărtată. Și, împăratul, fratele craiului, se numea Verde-Împărat; și îmăratul verde nu mai avea feciori, ci numai fete. Mulți ani trecuse la mijloc de când acești frați nu mai avuse prilej a se întâlni amundoi. Iară verii, adică feciorii craiului și fetele împăratului, nu se văzuse niciodată de când erau ei.\" Un al doilea argument, pentru evidențierea viziunii realiste a basmului, constă în caracterul tipic al personajelor, protagoniștii fiind lipsiți de puteri supranaturale, având trasaturi reprezentative pentru unele aspecte morale: Harap-Alb este eroul, Spânul este răufăcător, dar și \"un rău necesar\", Sfânda Duminică este pedagogul bun." +
                "   Conform celei mai cunoscute definiții, tema basmului este lupta dintre bine și rău, cu trimful binelui. Cu alte cuvinte, eroul lupta pentru impunerea unor valori morale. În această lume, \"războaiele erau grozave, drumurile foarte încurcate, caii zboară până la lună și la soare\", există uriași precum Gerilă, Flămânzilă, Setilă, Ochilă." +
                "   Titlul basmului este un oximoron, sugerând dubla personalitate a protagonistului: el are o identitate reală(fiu de crai) și una aparentă (slugă a Spânului)."+
                "   După opinia multor cercetători, între care și Vladimir Propp, G.Călinescu, Ovidiu Bârlea, basmele, mai ales cele populare, au un tipar narativ stereotip. Desfășurarea discursului epic urmărește un tipar narativ alcătuit din patru secvențe, inegale ca lungme și consistență; stare de echilibru (un crai avea trei feciori și aceștia trăiau fericiți la curtea împărătească); tulburarea echilibrului(Împăratul Verde, fratele craiului, nu are moștenitori la tron și cere un nepot să îi urmeze la împărăție); acțiunea de recuperare a echilibrului(Fiul cel mai mic al craiului pleacă spre unchiul său și este supus unor probe); restabilirea echilibrului (Harap-Alb devine împărat și se însoară cu fata împăratului Roș). Acest tipar narativ este asemănător, în linii mari, cu al oricărui basm. Reperele temporale și spațiale sunt vagi, nedefinite:\"Amu cică era odată într-o țară un crai, care avea trei feciori\".\n"+
                "   Fiind o creație epică, acțiunea se desfășoara potrivit momentelor canonice ale subiectului: în expozițiune, se arată că fiul de crai trebuie să ajungă la celălalt capăt al lumii pentru a soluționa un prejudiciu; lipsa moștenitorilor Împăratului Verde constituie intriga. Desfășurarea acțiunii include apariția ajutoarelor și depășirea cu bine a probelor, în deznodământ, se evocă felul în care Harap-Alb își recuperează identitatea."+
                "   Din punct de vedere compozițional, \"Povestea lui Harap-Alb \" este alcătuită din șapte părți: punerea la încercare, plecarea celui mai tânăr; întâlnirea cu Spânul;substituirea; sosirea la Împăratul Verde; episodul cu salatele; episodul cu cerbul; plecare la Împăratul Roșu și întâlnirea cu tovarășii fabuloși; cucerirea fetei de împărat cu ajutorul a șase încercări; întoarcerea la Împăratul Verde, pedepsirea trădătorului și căsătoria lui Harap-Alb.\n"+
                "   De factură folclorică sunt, deci, motivle narative tipice: călătoria, supunerea prin vicleșug, probele, demascarea impostorului, căsătoria. Se remarcă existența unor formule prestabilite, care intervin în cazuri determinate: fraze întregi, dialoguri stereotipe - expresii: despre fata Împăratului Roș se spune:\"la soare te puteai uita, dar la dânsa ba\";fraze stereotipe; Harap-Alb îi cere tatălui său:\"calul, armele și hainele cu care ai fost d-ta mire\"; dialoguri stereotipe:\"-Cum să te duc, ca vântul ori ca gândul?/-De mi-i duce ca gândul, tu mi-i prăpădii...\";formule inițiale:\"Amu cică era odată\";formule mediane:\"Mers-au ei zi și noapte, nu se știe cât au mers\\\";fromule finale:\"Și a ținut veselia ani întregi, și acum mai șine încă;cine se duce acolo bea și mănâncă. Iar pe la noi, cine are bani bea și mănâncă, iară cine nu se uită și rabdă\". De factură folclorică sunt și personajele adjuvante: calul năzdrăvan, Sfânta Duminică, dar și unele elemente magice: apa vie, apa moartă, smicele de măr.\n"+
                "   Basmul este construit, în întregime, pe principiul cifrei trei: confruntările fiilor de crai cu ursul; aparițiile Spânului; încercările la care Spânul îl supune pe Harap-Alb(salata, cerbul, aducerea fetei împăratului Roș); probele pețitului(casa de fier, ospățul pantagrulic, separarea macului de nisip); probele la carea îl supune fata însăși(s-o păzească, s-o identifice, să aducă apă moartă și apă vie). Construirea subiectului pe principilul cifrei trei este considerată de Vl. Propp o trăsătura specifică basmului și se numește triplicare.\n"+
                "   Originalitatea lui Creangă, viziunea sa despre lume, este determinată de următoarele elemente: specificul narațiunii, specificul fantasticului, nota comică și oralitatea stilului. Viziunea despre lume asociază supranaturalul popular cu evocarea universului rural, în mod realist, astfel încât comportamentul personajelor și relațiile dintre ele ilustrează cotidianul din lumea satului.\n"+
                "   Narațiunea lui Creangă, în raport cu basmul popular, se caracterizează prin: rapiditate, aglomerarea verbelor, individualizarea acțiunilor și a personajelor, frecvența dialogului. În ceea ce privește personajele, spre deosebire de basmul popular, unde acestea sunt convenționale, Creangă introduce în basmele sale viața (caracterizarea protagonistului, a personajelor monstruoase).\n" +
                "   Din perspectiva formării protagonistului, \"Povestea lui Harap-Alb\" este un bildungsroman. În opera lui Ion Creangă, dialogurile însuflețesc scenele în care figurează mai mulți actori, ca de exemplu, în care, închiși în casa de aramă încinsă, cei cinci tovarăși încep să se certe.\n"+
                "   Specificul fantasticul este dat de faptul ca în \"Povestea lui Harap-Alb\", fuziunea dintre real și imaginar atinge desăvârșirea. Schematismul inițial al basmului popular este supus unei operații de revitalizare; aflăm că drumurile sunt nesigure. Creangă nuanțează mobilurile faptelor prin interese practice(Împăratul Verde are nevoie de moștenitori) și prin necesitatea probării voiniciei. Tzventan Todorov consideră că una dintre condițiile fantasticului pur este perfecta împletire a straniului cu miraculosul. În operă predomină miraculosul. Neîncrezător în soluția magică, de origine miraculoasă, furnizată de cerșetoare, Harap-Alb nu renunță la criteriul judecății dictate de bunul-simț, dar subconștientul mitic îl determină să acorde credit sfatului de a-i dce \"răpciugii\" tava de jăratic (simbolul purificator al focului)Când vede calul răpciugos nu-și poate stăpâni uimmrea, și-l mustră într-un  limbaj pur țărănesc:\"Ghijoacă urâcioasă, ce ești!\". Numai elementul miraculos îl convinge pe erou;\"Calul se scutură de trei ori...\".Se poate observ, în acest episod, cum miraculosul se pune în slujba straniului, constituindu-se în soluția salvatoare, când intriga intră în impas.\n"+
                "   Elementul fantastic intervine în episodul cu salatele. Sfânta Duminică face unele preparative magice, de fapt pune în mișcare practici ale medicinei populare. Dicolo de nota supranaturală, episodul acesta reia, parcă, una dintre isprăvile din \"Amintiri din copilărie\" cu babele doftoroaie, căci Sfânta Duminică e, mai degrabă, doftoroaie de cât vrăjitoare. Ca dovadă, ea nu crede numai în efectul somnoroasei și îl sfătuiește pe Harap-Alb să ia și pielea ursului dată de tatăl său.\n"+
                "   În al doilea episod, asistăm la o sporire a fantasticului, deoarece Sfânta Duminică apelează la darurile de solomonăreasă; folosirea obrăzarului și sabia lui Statu-Palmă-Barbă-Cot, Sfânta Duminică are în vedere un transfer de încărcătură magică. Dificilă nu este răpunerea cerbului, ci contracararea emanației magice a ființei lui muribunde. Gerilă, Ochilă și ceilalți tovarăși,și ei personaje fantastice, aderă la o tipologie fabulos-mitică: sugerând sfera cunoașterii limitate, ei sunt gigantici, reprezintă expresia alegorică a unor impulsuri. În cazul schițelor de portret ale celor cinci, punctul de sprijin îl constituie trimiterea la ființa umană:\"dihanie de om\", \"namilă de om\", element ce ține de realism."+
                "   Încheindu-se șirul încercărilor inițiatice, calul năzdrăvan are dreptul de a interveni extirpând răul.\n"+
                "   Umorul are umătoarele surse:jocul de logică în care prima propoziție este contrazisă de cea imediat următoare:\"ba Gerilă se întindea de căldură, de-i treceau genunchele de gură\"(personajul se zgribulește de frig); o propoziție o repetă pe prima în care nu știe un nume, vrea să arate că-l știe);crearea raporturilor de falsă adversitate:\"pân-acum ți-a fost mai greu, dar de acum înainte tot așa are să-ți fie!\";expresii pleonastice:\"ochilă, frate cu Orbilă...\";asocieri de cuvinte nepotrivite:\"numai pe sine nu se vede cât e de frumușel\"(caracterizare ironică Ochilă); deformarea în scopuri satirice a profesiei clericale:Gerilă vrea să se încălzească \"bând sângele Domnului\";Gerilă parafrazează citate din Biblie:\"al dracului ă fii cu tot neamul tău, în vecii vecilor, amin!\";raportarea la animale a viciilor umane:Păsări-Lăți-Lungilă ospătează \"cu lăcomie ca un vultan hămisit\", Gerilă clănțănește dn măsele \"ca un cocostârc din cei bătrâncioși\";împerecheri fonetice hilare:Gerilă se adresează tovarăsilor:\"mangosiților și farfasiților\"(apelativele sugerând grotescul perrsonajelor):Gerilă are \"buzoaie groase și dăbălăzate\"."+
                "   Oralitatea derivă din apariția următoarelor elemente:punctele de suspensie sugerează discontinuitatea vorbirii, variațiile de durată ale sunetelor:\"Voi să vă lăfăiți și să huzuriți de căldură, iară eu să crap de frig. Bu...nă treabă!\";intonația vioaie rezultă din exprimarea paratactică:\"ieie-vă și pielea de pe cap, ce am eu de acolo?\";repetiția:\"la calic slujești, la calic rămâi\";eliminarea conjuncției:\"Și dă el să descuie ușa, nu poate;dă s-o desprindă, nici atâta\";topica:\"dar Harap-Alb ca de foc se ferea\";încheietura puternică a unor fraze, care sugerează fluctuații, curbe în rostire:\"Și cum ajung, o dată intră buluc în ogradă\";introducerea locuțiunilor conjuncționale aparent negative(care indică diferențe de nivel în vorbire):\"Și atunci unde nu începe Flămânzilă a cărăbăni deodată în gură câte o harabă de pâine\"(unde adverbul \"nu\" arată neprevăzutul);repetarea interjecțiilor sugerează mișcări ritmice;\"Și odată pornesc ei, teleap, teleap, teleap\"."+
                "   În opinia mea, \"Povestea lui Harap-Alb\" este un basmu cult, în care miraculosul și fantasticul sunt estompate, în favoarea verosimilității. Astfel, discursul literar ilustrează viziunea autorului despre lume, care integrează în universul ficțional doar elementele ce pot sugera un scop moralizator și o perspectivă realistă. Se remarcă faptul că, din basmul popular, autorul păstrează personajele fabuloase, dar și umanizarea fantasticului prin comportamentul, gestica și limbajul personajelor.\n"+
                "   În ansamblul ei,\"Povestea lui Harap-Alb\" poate fi considerată un bildungsroman, cu subiect fabulos, structurat în modalități de exprimare realistă.\n"+
                "   În concluzie, prin Harap-Alb autorul evidențiază destinul unui personaj care, deși nu are puteri supranaturale (cum se întâmplă, de regulă, cu protagonistul din literatura populară), izbutește să parcurgă drumul inițiatic. El devine împărat \"iubit\", \"slăvit\" și \"puternic\", împlinind astfel profețiile Sf.Duminici.\n"
                ;

        stringBuilder.append(finallyEseu);
        e1.setText(stringBuilder.toString());
    }

}
