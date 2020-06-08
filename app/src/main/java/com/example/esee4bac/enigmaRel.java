package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class enigmaRel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enigma_rel);

        TextView relEnigma = (TextView) findViewById(R.id.relEnigma);
        TextView e24 = (TextView) findViewById(R.id.e24);

        relEnigma.setText("Relația dintre Felix și Otilia");

        StringBuilder stringBuilder = new StringBuilder();
        String finallyEseu = "  Publicat în 1938, „Enigma Otiliei\" apare la sfârşitul perioadei interbelice, de puternică afirmare a acestei specii, fiind roman, prin amploarea acțiunii, desfăşurate pe mai multe planuri, cu un conflict complex, la care participă numeroase personaje. Într-un moment în care romanul românesc se regăsea într-un efort de ascensiune şi de sincronizare cu valorile europene, înzestrat cu talent şi cu simţul limbii, G. Călinescu realizează o scriere pentru care alege deliberat formula balzaciană. "+
                "  Acţiunea romanului începe cu venirea tânărului Felix, orfan, absolvent al Liceului Internat din Iaşi, la Bucureşti, în casa unchiului şi tutorelui său legal, pentru a urma Facultatea de Medicină. Costache Giurgiuveanu este un rentier avar, care o creşte în casa lui pe Otilia Mărculescu, fiica sa vitregă, cu intenţia de a o înfia. Aglae o consideră un pericol pentu moştenirea fratelui ei. Este roman realist prin: temă, structură (închisă), specificul secvenţelor narative, realizarea personajelor, dar depăşeşte modelul realismului clasic, al balzacianismului, prin spiritul critic şi polemic (parodic, ludic), prin elemente ale modernităţii. În general, caracterizarea personajelor se realizează ca în romanul realist-balzacian. Prin tehnica focalizări, caracterul personajelor se dezvăluie progresiv, pornind de la datele exterioare ale existenţei lor: prezentarea mediului, descrierea locuinţei, a camerei, a fizionomiei, a gesturilor. "+
                "  În ansamblu, caracterizarea personajelor se bazează pe ideea balzaciană, potrivit căreia mediul îşi pune amprenta asupra evoluției individului. Tipurile (personajele tipice) întruchipează: avarul, arivistul, fata bătrână, „baba absolută\", moşierul rafinat, maniacul, „eternul feminin\". Acestea sunt construite progresiv, pornind de la detalii exterioare: descrierea locuinţei, a fizionomiei, a gesturilor, ideea de a sugera faptul că detaliile oferă posibilitatea de a înţelege întregul. "+
                "  O excepţie de la „determinismul\" balzacian o constituie portretul Otiliei, realizat prin tehnici moderne: comportamentismul şi reflectarea poliedrică. Otilia este fascinantă şi exercită o atracţie irezistibilă pentru majoritatea celor din jur. Ea este expansivă, capricioasă, dar şi onestă. Ii declară lui Felix că îl iubeşte, dar oscilează Intre acest sentiment şi nevoia de echilibr . Otilia se comportă ca un om liber, nu ţine cont de nicio regulă exterioară. Se apucă, e curaţenie, dar lasă totul baltă, ca să mergă desculţă prin iarbă, după ce şi-a scos ciorapii în faţa lui Felix. Otilia poartă o mască, dincolo de care nu trece nimeni. La începutul relaţiei lor, Felix recunoaşte: „Pentru mine, Otilia, ai început să devii o enigmă\". În epilog, Felix vede în ea o femeie frumoasă, lipsită de strălucire. Are suficiența să creadă că a înteles-o, că a străpuns masca. Faptul că o judecă după imaginea din fotografie este limitativ, iar comparaţia cu o actriță trimite tot la ideea de mască. Afirmația din acest moment a lui Pascalopol: „Pentru mine e o enigmă\", arată că acesta din urmă este singurul care îşi dă seama de profunzimea Otiliei. Atitudinea lui face mai uşoară înţelegerea afirmaţiei surprinzătoare a autorului insusi: „Flaubertizând, aş putea spune că. Otilia sunt eu\". \n"+
                "  Student la medicină, el însuşi fiu de doctor, Felix vine la Bucureşti, ,,într-o seară de la începutul lunii iulie 1909, cu puţin înainte de orele zece\", imbrăcat în uniformă de licean. Fixând din prima pagină a romanului timpul şi locul, în stil balzacian, scriitorul îşi descrie personajul: „Faţa insă îi era juvenilă şi prelungă, aproape feminină din pricina şuviţelor mari de păr ce-i cădeau de sub şapcă, dar culoarea măslinie a tenului și tăietura elinică a nasului corectau, printr-o notă voluntară, intâia impresie\". \n"+
                "  Scriitorul omniscient alcătuieşte o adevărată fişă biografică: „Se numea Felix Sima şi sosise cu o oră mai înainte în Bucureşti, venind din Iaşi, unde fusese elev în clasa a VIII-a la Liceul internat. [...] În afară de un oarecare depozit în bani, doctorul lăsa lui Felix o casă cam veche, dar solidă şi rentabilă în strada Lăpuşneanu. Pentru administrarea acestor bunuri, fusese indicat ca tutore «unchiul Costache», cumnatu-său\"."+
                "  Evoluţia profesională a lui Felix este ascendentă. Dotat cu certe calităti intelectuale, cu o tenacitate şi o voinţă de a se realiza, devine „profesor universitar, specialist cunoscut, autor de memorii şi comunicări ştiintifice, colaborator la tratate de medicină cu profesori francezi\". O sensibilitate de o mare acuitate, precum şi nevoia de afecţiune se prefigurează din copilărie, când a rămas fără mamă încă de pe când era în şcoala primară. \n"+
                "  Trimis de tatăl său într-un pensionat, copilul trăieşte intens clipa înstrăinării de casă: „Toată noaptea Felix fu chinuit de o agitaţie nemaivăzută, care-i sfărâma somnul\". Are un simţ de disciplină înnăscut, sentimentul valorii lui personale. Drumul devenirii sale profesionale se îmbină cu cel al dragostei. \n"+
                "  Când soseşte în casa lui Costache Giurgiuveanu, apariţia Otiliei „îi dădu un sentiment inedit, demult presimțit\". Criza adolescenţei, în drumul spre maturizare, prin care trece Felix, este descrisă prin acumulări succesive. Felix parcurge drumul de la simpla atracţie până la acuitatea trăirii sentimentului „Pentru intâia oară. Felix era prins de braţ cu atâta familiaritate de o fată şi pentru prima oară, luând act de izbucnirea unei simţiri până atunci latente, încearcă acul geloziei, văzând cum Otilia generalizează tratamentul\". Comportamentul imprevizibil al Otiliei îl chinuie şi-l derutează încearcă față de ea o atracţie care „deveni din ce în ce mai tiranică.'\". Familiaritatea fetei cu Pascalopol, prezenţa permanentă a acestuia îl indispun. \n"+
                "  Numeroase pagini descriu cu luciditate stările psihice şi fizice prin care trece Felix: neliniște și incertitudine, adoraţie şi deznădejde, gelozie şi fericire. Chinurile prin care trece când Otilia, plecată la Paris cu Pasclopol, nu-i răspunde la scrisoare, sunt revelatoare. Îndrăgostit, visător şi reflexiv, simte nevoia prezenţei sale feminine. \n"+
                "  Clipele caste, petrecute noaptea, stând de vorbă în camera Otiliei îl umplu de fericire, pentru ca apoi să fie tulburat de îndoieli. Față de Pascalopol are sentimente contradictorii: gelozie, dar şi simpatie. Nici Pascalopol, nici Felix nu sunt siguri de iubirea Otiliei. Experienţa erotică, împlinită senzual, prin cunoaşterea Georgetei, îl maturizează, protagonistul privind altfel imaginea şi comportamentul Otiliei. Până la capitolul al XVI-lea, Otilia este prezentată exclusiv prin comportamentism (fapte, gesturi,replici), fără a i se cunoaşte gândurile, din perspectiva unică a naratorului, cu excepţia celor mărturisite de personaj. Această tehnică, este dublată de reflectarea poliedrică a personalităţii Otiliei în conştiinţa celorlalte personaje, ceea ce conferă ambiguitate personajului, iar în plan simbolic sugerează enigma, misterul feminităţii. Relativizarea imaginii, prin reflectarea în mai multe oglinzi, alcătuieşte un portret contradictoriu: „fe-fetiţa\" cuminte şi iubitoare pentru moş Costache, fata exuberantă, „admirabilă, superioară\" pentru Felix, femeia capricioasă, „cu un temperament de artistă\" pentru Pascalopol, „o dezmăţată, o stricată.\" pentru Aglae, „o fată deşteaptă\", cu spirit practic pentru Stănică, o rivală în căsătorie pentru Aurica. \n"+
                "  În opinia mea, ca și Felix, Otilia este o tânără, în formare. Deşi îl iubeşte pe tânăr, ea gândeşte matur şi, în mod altruist, decide să-l părăsească, nedorind să fie un obstacol în cariera lui Felix. \n"+
                "  În concluzie, chipul fetei rămâne pentru totdeauna învăluit în mister, o imagine derutantă, amestec de onestitate, cochetărie, puritate, iubire incertă. Finalul romanului întăreşte impresia de vis tulburător al iubirii adolescentine şi proiectează un personaj complex, martor şi actor.\n";
        stringBuilder.append(finallyEseu);
        e24.setText(stringBuilder.toString());
    }
}
