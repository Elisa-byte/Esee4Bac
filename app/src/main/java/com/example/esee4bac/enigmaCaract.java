package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class enigmaCaract extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enigma_caract);

        TextView caractEnigma = (TextView) findViewById(R.id.caractEnigma);
        TextView e23 = (TextView) findViewById(R.id.e23);

        caractEnigma.setText("Caracterizarea lui Costache Giurgiuveanu");

        StringBuilder stringBuilder = new StringBuilder();
        String finallyEseu = "  „Enigma Otiliei\", cel de-al doilea roman călinescian, publicat după debutul cu romanul „Cartea nunţii\", marchează un însemnat moment în evoluția prozei de observaţie morală şi socială, cartea aducând cu sine o diversitate de caractere, fiecare personaj devenind un exponent al unei anumite categorii umane. Modelul romanului călinescian utilizează tipologii fixe, personajele sale nemodificându-se de-a lungul evenimentelor, rămânând aceleaşi sub aspectul structurii morale, ceea ce denotă consecvenţa, continuitatea lor caracterologică. \n"+
                "  Costache Giurgiuveanu este personajul-pivot al romanului, întrunind atributele clasice ale avarului, diminuate, oarecum, prin duioşie paternă. Prin el se continuă tipologia avarului din literatura română. (Hagi Tudose din opera omonimă a lui B. Șt. Delavrancea), dar şi din cea universală (personajele Goriot si Grandet din operele lui Balzac). G. Călinescu alcătuind, prin Costache Giurgiuveanu, un personaj complex. \n"+
                "  Romanul „Enigma Otiliei\" este conceput pe două planuri: destinul unui tânăr care, înainte de face o carieră, parcurge o criză erotică (Felix) şi apoi ca „istoria unei moșteniri\" (Alexandru Piru). Cum această moștenire devine centrul demersului narativ, Giurgiuveanu, posesorul banilor râvniţi de întreaga familie, se conturează ca personaj principal. \n"+
                "  Autorul îi lămurește biografia printr-o abundenţă a detaliilor: el este „unchiul lui Felix\", cumnat cu tatăl acestuia, care murise de un an, si tutore al băiatului orfan, administrându-i bunurile rămase de la părinţi. De asemenea, este si tutore al Otiliei, fiica nevestei sale decedate. \n"+
                "  Prezentarea lui mos Costache se face prin prisma lui Felix (caracterizare directă), în momentul care tânărul soseste, seara, casa acestuia încă de la începutul romanului, apariţia sa este bizară, bătrânul deconcertându--l pe Felix, atunci când îi spune: „nu stă nimeni aici\" - răspuns absurd. Felix îşi imaginase că tutorele său este un om masiv, „de o greutate extraordinară\", având în vedere că el este un om bogat, deţine mai multe imobile, îi fusese lăsat în grijă. Aspectul fizic anticipat era un argument pentru a-şi inchipui că Giurgiuveanu are forță. Însă în fata lui apare „un omuleţ subţirel şi puţin încovoiat\", cu o chelie de porțelan, cu fața spână, buzele galbene de prea mult fumat, „acoperind numai doi dinţi vizibili, ca nişte aşchii de os\", cu ochii clipind rar şi moale, înfăţişare ce-i trezeşte lui Felix imaginea unei „bufniţe\". \n"+
                "  Folosind tehnica balzaciană, autorul descrie în detaliu aspectul exterior şi interior al casei părăginite, aflate aproape în ruină, care trimite la conturarea imaginii despre proprietar (caracterizare indirectă), la esenţa caracterologică (decrepitudinea şi avariţia), dar şi la un soi de parvenitism, arhitectura casei sugerând „intenția de a executa grandiosul clasic în materiale nepotrivite\" (Nicolae Manolescu). \n"+
                "  Caracterizarea personajului se face indirect, prin acumularea de fapte, vorbe, gesturi, gânduri, atitudini. Micile „ciupeli\" faţă de Pascalopol, socotelile încărcate pentru întreţinerea lui Felix, obţinerea unor câştiguri anuale prin închirierea unor imobile pentru studenţi, localurile, restaurantele motivează avariţia personajului, mai ales că el se supune unor privaţiuni personale de hrană, îmbrăcăminte, îngrijiri medicale. De câte ori are prilejul să mănânce de la alţii, gesturile sale sunt sugestive pentru lăcomia structurală: „Bătrânul mânca cu lăcomie, vârând capul în farfurie\". Vrea să-i construiască Otiliei o casă, pentru a-i asigura „fe-fetiţei\" lui un viitor, dar foloseşte materiale ieftine, strânse din demolări, iar planul architectural îl face singur.Vinde manuale, seringi, instrumente medicale pe care le confiscă sau le ia, pur şi simplu, de la studenţii care stăteau la el cu chirie şi care întârziau cu plata acesteia. \n"+
                "  Banii îi ţine în casă, ascunşi în locuri ferite, temându-se mereu că-l vede cineva atunci când umblă cu ei, dar nu îi depune în bancă, deoarece avarul trebuie să pipăie şi să vadă mereu banii pe care-i iubeşte mai mult decât orice pe lume. \n"+
                "  Ţinuta vestimentară (caracterizare indirectă) este ridicolă: poartă ciorapi de lână de o grosime „fabuloasă\" şi „plini de găuri\", unghiile netăiate, ghete de gumilastic, nădragii largi de stambă, colorată, prinşi cu sfoară. Gesturile, bălbâiala, răguşeala sunt arme de apărare, mijloace de a câştiga timp, reacţii provocate de teama de a nu fi jefuit, de a nu fi pus în situaţia de a da un ban cuiva care îi cere. \n"+
                "  Sentimentele paterne pe care le are faţă de Otilia, singura fiinţă faţă de care este generos, atât cât poate el să, fie, îl fac să înţeleagă faptul că, adoptarea fetei, testamentul şi depunerea într-un cont pe numele ei a unei sume de bani constituie o cale dreaptă şi cinstită de a-i purta de grijă, dar teroarea Aglaei, pe de-o parte, şi patima pentru bani, pe de altă parte, îi curmă zilnic decizia, el dovedind un caracter slab. \n"+
                "  Aspectul dezolant al casei sugerează avariţia personajului. Psihologia umană devine astfel o funcţie a mediului, ca şi la Balzac, dar scriitorul român insistă pe amănuntele arhitectonice conturând minuţios exteriorul, ceea ce îl determină, pe criticul literar Nicolae Manolescu să afirme: „Dacă Balzac crea viaţă, Călinescu o comentează, atitudinea lui fiind critică\". Costache Giurgiuveanu întruchipează trăsăturile clasice ale avarului, diminuate oarecum prin sentimentele de duioşie paternă faţă de Otilia. Scriitorul îl descrie încă din primul capitol, în momentul în care Felix soseşte seara, în casa acestuia. Felix constată mirat că bătrânul care coborâse scara cu „pârâituri grozave\" era „un omulet subţire şi încovoiat\". \n"+
                "  Portretul fizic este realizat prin acumularea detaliilor, imaginea fiind grotescă: „faţa părea aproape spană\", „buzele erau întoarse în afară şi galbene de prea mult fumat\", „zâmbea cu cei doi dinţi, clipind rar şi moale\". Bâlbâindu-se (mijloc de apărare şi de câştiga timp), bătrânul avar refuză, la început, să-l primească pe Felix în casă, deşi era tutorele său legal: „-Nu-nu- nu ştiu... nu-nu stă nimeni aici, nu cunosc.\" O altă modalitate de caracterizare este pluriperspectivismul: pentru Otilia, „papa\" este „un om bun, dar are şi el ciudăţeniile lui\", Stănică. Raţiu îl numeşte „pezevenchi\", iar Felix afirmă că „avariţia lui este mai mult o mânie\". \n"+
                "  Conştient că sora lui, Aglae, ca şi nepoţii (Aurica, Titi), la care se adaugă escrocul, abil şi jovial, Stănică Raţiu - toţi vor să-l fure, păcălindu-l şi dorindu-i moartea cât mai devreme, Costache trăieşte drama neputinţei proprii. El este bătrân şi neajutorat, dar şi neînduplecat, când e vorba despre bani. Criticul Pompiliu Constantinescu este de părere că Giurgiuveanu „nu este un monstru, cu expresia unei psihologii nefericite\", ci un personaj tragic. Demersul analitic al romanului cumulează nenumărate episoade, gânduri, vorbe şi gesturi care pun în lumină zgârcenia delirantă a personajului (atitudinea față de chiriaşii restanţieri, vânzarea de case, visul de a-i construi Otiliei o locuintă cu materiale din demolări). Iubirea sa paternă este sinceră, neputând să învingă patima pentru bani. Sfârşeşte jalnic, distrus fizic după al doilea atac şi psihic, prin violenţa lipsită, de scrupule a lui Stănică Raţiu. \n"+
                "  În opinia mea, protagonistul este victima propriei suspiciuni, dar şi a lui Stănică (furând banii lui moş Costache, îi grăbeşte sfârşitul). Fraza ce-l defineşte este cea pe care o spune puţin înainte să moară: „Să, munceşti, să strângi. Asta-i toată, filosofia\". \n"+
                "  În concluzie, pendulând între grotesc, comic şi tragic, eroul se defineşte complex, ca individualitate pregnantă care se diferenţiază de avarul clasic. \n";
        stringBuilder.append(finallyEseu);
        e23.setText(stringBuilder.toString());
    }
}