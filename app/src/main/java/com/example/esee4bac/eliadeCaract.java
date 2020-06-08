package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class eliadeCaract extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliade_caract);

        TextView caractEliade = (TextView) findViewById(R.id.caractEliade);
        TextView e20 = (TextView) findViewById(R.id.e20);

        caractEliade.setText("Caracterizarea lui Allan");

        StringBuilder stringBuilder = new StringBuilder();
        String finallyEseu = "  În realizarea romanului „Maitreyi\", Mircea Eliade porneşte de la ideea că literatura autentică se bazează pe o experienţă trăită, prelucrând idea lui Andre Gide, conform căreia „orice cunoaştere pe care n-a precedat-o o senzaţie e de prisos\". Dominanta romanelor sale este problematica de tip existenţialist, scriitorul considerând că romanul trebuie să se orienteze spre ontologie. "+
                "  „Maitreyi\" este, în fond, o poveste de dragoste despre care, la apariţie, criticul Pompiliu Constantinescu afirma: „Se va citi romanul domnului Eliade, în istoria noatră literară, ca un moment de graţie al autorului; viitorul rezerva operei o situaţie analogă cu Manon Lescaut, cu „Paul et Virginie\" sau cu acea încântătoare poveste de iubire a Evului Mediu, „Le roman de Tristan et Iseut\". \n"+
                "  Pentru personajele principale ale cărţii (Allan, Maitreyi, dar şi Chabu) iubirea are un caracter nefast. Fatalitatea acaparează întregul joc al pasiunii Chabu înnebuneşte pentru o vreme, redevine apoi lucidă şi, în cele din urmă, moare. Maitreyi e aproape înnebunită la despărţirea de Allan, după cum îi mărturiseşte acestuia un cunoscut comun: „Maitreyi ţipă întruna: «De ce nu mă daţi la câini? De ce nu mă aruncaţi în stradă?!» Eu cred că a înnebunit.\" Allan însuşi îşi pierde luciditatea şi se supune pasiunii. \n"+
                "  De aceea, există descris în roman un întreg ceremonial al pasiunii. Între Maitreyi Allan va exista o logodnă mistică de fapt o uniune a sacrului cu profanul. \n"+
                "  Ajuns în casa lui Narendra Sen, Allan face cunoştinţă cu Maitreyi, fata de 16 ani a acestuia, nefiind impresionat în mod deosebit de ea. La început i se pare chiar urâtă, însă, treptat, aceasta începe să-l subjuge. Este memorabil portretul fizic al acesteia, caracterizată direct de narator: „Maitreyi mi s-a părut atunci mult mai frumoasă, în sari de culoarea ceaiului palid, cu papuci albi cusuţi cu argint, cu şalul asemenea cireşelor galbene şi buclele ei prea negre, ochii ei prea mari, buzele ei prea roșii creau parcă o notă şi mai puţin umană în acest trup înfăşurat și totuşi transparent... O priveam cu oarecare curiozitate, căci nu izbuteam să înţeleg ce taină ascunde făptura aceasta în mişcările ei moi de mătase, cu zâmbetul timid, preliminar de panică, şi mai ales glasul ei atât de schimbat de fiecare clipă...\"\n"+
                "  Eroul-narator e tulburat, subjugat, e fericit că „eram iubit de o fecioară de 16 ani pe care nu o sărutase încă nimeni pe gură, în afară de mine\" (caracterizare directă). Autocaracterizarea dezvăluie o fire delicată, dar şi pătimaşă și senzuală, căci ea este îndrăgostită de un anume copac: „Stam ziua întreagă îmbrăţişaţi şi îi vorbeam, îl sărutam, plângeam. Îi făceam versuri fără să le scriu, i le spuneam numai lui... Și când mă mângâia el cu frunzele pe obraz, simţeam o fericire atât de dulce, încât imi pierdeam răsuflarea.\" \n"+
                "  Legământul ei de dragoste (caracterizare indirectă) este impregnat de mitologie: „Voi creşte din el ca iarba din tine. Și cum aştepţi tu ploaia, aşa îi voi aştepta eu venirea,  şi cum îţi sunt ţie razele, aşa va fi trupul lui mie\". Comportamentul tinerei evidenţiază o deosebită intensitate a sentimentului iubirii: „Am simțit-o lângă mine, strângându-se toată, parcă ar fi încercat să, se ascundă, să uite. Nu mai era sete trupescă aceea, ci sete de mine tot; ar fi vrut să treacă în mine toată, aşa cum trecuse sufletul ei\". Criticul G. Dimisianu, referindu-se la această secvenţă narativă, afirma: „Căutarea sinelui sau a jumatăţii în această experienţă, face ca dragostea să fie văzută, ca o nostalgie a androginismului\". \n"+
                "  Vorbele din capitolul XI evidențiază capacitatea de sacrificiu a eroinei. Capitolul cuprinde un motiv anticipativ al finalului, căci Maitreyi i se confesează lui Allan: „Mi-ai spus odată că, dacă fi fost violată şi zvârlită afarădin casă, tu m-ai fi iubit încă. Mă gândeam ce bine ar fi fost să se întâmple aşa. N-ar mai rămânea atunci nicio piedică în calea unirii noastre\",  știindu-se că, după, alungarea lui Allan, Maitreyi se dă unui vânzător de fructe, în speranţa că va fi alungată de familia ei (caracterizare indirectă, prin fapte). \n"+
                "  Maitreyi este un amestec de contraste: sobră, indiferentă, dispreţuitoare, provocatoare, profundă, complexă, plină de poezie şi deschidere spre jocul intelectual. Elanurile adolescentine ale Maitreyiei (gestul aruncării florii care era împletit un fir din părul ei) sunt pentru indiancă „semne\", „hazard\" ce semnifică şi prefigurează destinul. Misterul se menține şi în profan, nu numai în sacru. \n"+
                "  Când într-un stadiu al erosului, îşi atingeau mâinile ori picioarele, conform unei tradiții  (gest de prietenie), Maitreyi era câştigată numai de joc, de voluptatea amăgirii, nu de ipsită. Treptat, se produc mutaţii, emoţia erotică a fetei suspendă provizoriu jocul, dar numai pentru o clipă. Jocurile Maitreyiei ţin de ritualul erotic şi mistic, îmbogăţesc pasiunea. \n"+
                "  Maitreyi creează, prin ritualul şi limbajul ei solemn, iluzia obținerii absolutului. Distincţia, intelectualitatea, elevarea spirituală o caracterizează pe Maitreyi. Prin Maitreyi, paradisul pierdut rămâne o aspiraţie; acesta este dorit, căutat şi descoperit în eul său, prin spiritualizare. Eroina îşi făureşte o mitologie a ei, creaţia aceasta emană din infinită iubire. Pentru ea, ipostaziere sacră, Allan este: „soare\", „aer\", „floare\", „zeu de aur şi din pietre scumpe\" (registru stilistic metaforic), este proiecţia universală şi sacră intangibilă. Este, deci, o permanentă aspiraţie spre absolutc. \n"+
                "  Spre deosebire de Allan, care întruchipează tipul europeanului deschis spre lume şi interesat de ea, Maitreyi este tipul asiatic, indian, a cărui principală trăsătură este interesul pentru universul interior, pentru sufletul uman, pentru întoarcerea spre sine. \n"+
                "  În convorbirile lui Eliade cu Claude-Flenri Rocquet, la un moment dat, se face o comparaţie între redarea foarte senzuală a Maitreyiei şi frescele de la Ajanta. Mircea Eliade îşi aminteşte: „într-o fermecătoare scrisoare pe care mi-a trimis-o după citirea romanului, Gaston Bachelard vorbe despre o mitologie a voluptăţii». Cred că avea dreptate, fiindcă, într-un anumit sens, senzualitatea este transfigurată\" (Mircea Eliade, „Încercarea labirintului\").  \n"+
                "  În opinia mea, Maitreyi rămâne un moment de referinţă pentru literatura română deoarece propune atenţiei cititorului un personaj feminin complex şi fascinant. \n"+
                "  În concluzie, prin diversele procedee de caracterizare (autocaracterizare, caracterizare directă, caracterizare indirectă), Mircea Eliade conturează un personaj complex, care fascinează prin mister şi exotism. Maitreyi, ilustrează un mit al feminității, o sinteză de spiritualitate şi senzualitate.\n";
        stringBuilder.append(finallyEseu);
        e20.setText(stringBuilder.toString());
    }
}
