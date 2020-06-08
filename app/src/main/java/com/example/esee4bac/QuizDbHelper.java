package com.example.esee4bac;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.Nullable;
import com.example.esee4bac.QuizContract.*;

import java.util.ArrayList;
import java.util.List;
//creating the database
public class QuizDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Teste.db";
    private static final int DATABASE_VERSION = 1; //for upgrade function, incremented when upgrading

    private static QuizDbHelper instance;
    private SQLiteDatabase db;

    private QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //avoiding many database connections when many activities are opened
    public static synchronized QuizDbHelper getInstance(Context context) {
        if (instance == null) {
            instance = new QuizDbHelper(context.getApplicationContext());
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_CATEGORIES_TABLE = "CREATE TABLE " +
                CategoriesTable.TABLE_NAME + "( " +
                CategoriesTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CategoriesTable.COLUMN_NAME + " TEXT " +
                ")";

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuestionsTable.COLUMN_DIFFICULTY + " TEXT, " +
                QuestionsTable.COLUMN_CATEGORY_ID + " INTEGER, " +
                "FOREIGN KEY(" + QuestionsTable.COLUMN_CATEGORY_ID + ") REFERENCES " +
                CategoriesTable.TABLE_NAME + "(" + CategoriesTable._ID + ")" + "ON DELETE CASCADE" +
                ")";

        db.execSQL(SQL_CREATE_CATEGORIES_TABLE);
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillCategoriesTable();
        fillQuestionsTable();
    }

    // for drop, add column ...
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + CategoriesTable.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillCategoriesTable() {
        Category c1 = new Category("Harap-Alb");
        addCategory(c1);
        Category c2 = new Category("Moara cu noroc");
        addCategory(c2);
        Category c3 = new Category("Alexandru L.");
        addCategory(c3);
        Category c4 = new Category("Ion");
        addCategory(c4);
        Category c5 = new Category("Baltagul");
        addCategory(c5);
        Category c6 = new Category("Ultima noapte");
        addCategory(c6);
        Category c7 = new Category("Maitreyi");
        addCategory(c7);
        Category c8 = new Category("Enigma Otiliei");
        addCategory(c8);
        Category c9 = new Category("Morometii");
        addCategory(c9);
    }

    private void addCategory(Category category) {
        ContentValues cv = new ContentValues();
        cv.put(CategoriesTable.COLUMN_NAME, category.getName());
        db.insert(CategoriesTable.TABLE_NAME, null, cv);
    }

    private void fillQuestionsTable() {
        //////////////////////////////////////// TV- HARAP
        Question q1 = new Question("Unde a aparut \"Povestea lui Harap-Alb\" si in ce perioada?",
                "Dacia literara, 1877", "Convorbiri literare 1873", "Convorbiri literare, 1877", 3,
                Question.DIFFICULTY_EASY, Category.HARAP_ALB);
        addQuestion(q1);
        Question q2 = new Question("Din ce specie literara face parte?",
                "Basm fantastic", "Basm cult", "Basm animalier", 2,
                Question.DIFFICULTY_EASY, Category.HARAP_ALB);
        addQuestion(q2);
        Question q3 = new Question("Tema basmului este: ",
                "Lupta dintre bine si rau", "Framantarile vietii sociale", "Procesul de formare al eroului", 1,
                Question.DIFFICULTY_EASY, Category.HARAP_ALB);
        addQuestion(q3);
        Question q4 = new Question("Titlul basmului este: ",
                "Antifraza", "Oximoron", "Simbol", 2,
                Question.DIFFICULTY_EASY, Category.HARAP_ALB);
        addQuestion(q4);
        Question q5 = new Question("Desfasurarea discursului epic este alcatuita din:",
                "4 parti", "3 parti", "6 parti", 1,
                Question.DIFFICULTY_EASY,Category.HARAP_ALB);
        addQuestion(q5);
        Question q6 = new Question("Din punct de vedere compozitional este format din: ",
                "7 secvente", "4 secvente", "6 secvente", 1,
                Question.DIFFICULTY_EASY, Category.HARAP_ALB);
        addQuestion(q6);
        Question qq1 = new Question("Personajul care va extirpa raul: ",
                "Calul nazdravan", "Statu-Palma-Barba-Cot", "Fata Imparatului Ros", 1,
                Question.DIFFICULTY_EASY, Category.HARAP_ALB);
        addQuestion(qq1);
        Question qq2 = new Question("Cum este numit in esee Spanul si ce rol indeplineste acesta?",
                "Spanul este considerat un \"om insemnat\" fiind un pedagog rau pentru Harap-Alb", "Spanul este considerat un \"om insemnat\" fiind un pedagog bun pentru Harap-Alb","Spanul este considerat un \"om insemnat\" fiind un personaj adjuvant", 1,
                Question.DIFFICULTY_EASY, Category.HARAP_ALB);
        addQuestion(qq2);
        Question qq3 = new Question("In ce tipar de personaj se incadreaza Harap-Alb?",
                "Personaj rotund", "Personaj plat","Personaj odiseic", 1,
                Question.DIFFICULTY_EASY, Category.HARAP_ALB);
        addQuestion(qq3);
        Question qq4 = new Question("Care dintre urmatoarele simboluri poate fi considerat simbol al trecerii intre cele doua lumi?",
                "Podul", "Focul","Fantana", 1,
                Question.DIFFICULTY_EASY, Category.HARAP_ALB);
        addQuestion(qq4);


        Question q7 = new Question("Ce principiu este folosit in acest basm?",
                "Principiul estetic", "Principiul traditionalist", "Principiul celor trei (triplicare)", 3,
                Question.DIFFICULTY_MEDIUM, Category.HARAP_ALB);
        addQuestion(q7);
        Question q11 = new Question("Care sunt personajele adjuvante din basm?",
                "Tovarasii fabulosi", "Furnicile si albinele", "Calul si Sfanta Duminica", 3,
                Question.DIFFICULTY_MEDIUM, Category.HARAP_ALB);
        addQuestion(q11);
        Question q12 = new Question("Ce simbol este intalnit in basm? ",
                "Simbolul focului purificator: tava de jaratic data \"rapciugii\"", "Simbolul celor 6 incercari", "Simbolul celor trei aparitii ale Spanului", 1,
                Question.DIFFICULTY_MEDIUM, Category.HARAP_ALB);
        addQuestion(q12);
        Question q14 = new Question("Incercarile Imparatului Ros prin care trece Harap-Alb sunt: ",
                "Episodul cu salatele, cu cerbul si aducerea fetei Imp. Ros", "Sa o pazeasca pe fata lui, sa o identifice, sa aduca apa vie si apa moarta", "Casa de fier, ospatul pantagruelic, separarea macului de nisip", 3,
                Question.DIFFICULTY_MEDIUM, Category.HARAP_ALB);
        addQuestion(q14);
        Question q17 = new Question("Observam caracterizare directa in:",
                "Spusele Sf. Duminici:\"imparat cum n-a mai fost altul pe pamant\"", "Prin trecerea tuturor probelor dand dovada atat de intelepciune, cat si de naivitate ","Construirea stupului de albine, ocolirea nuntii de furnici ", 1,
                Question.DIFFICULTY_MEDIUM, Category.HARAP_ALB);
        addQuestion(q17);
        Question q18 = new Question("Cum scapa Harap-Alb de juramant?",
                "Dupa ce ajunge sa stapaneasca peste meleagurile Imparatului Ros", "Prin casatoria sa cu fata Imparatului Ros","Prin moartea fizica: \"reteaza capul lui Harap-Alb\"", 3,
                Question.DIFFICULTY_MEDIUM, Category.HARAP_ALB);
        addQuestion(q18);
        Question q19 = new Question("Care dintre urmatoarele scene este una simbolica pentru evolutia protagonistului?",
                "Scena aducerii smicelelor de mar si a apei vii si a apei moarte", "Scena coborarii in fantana","Proba-cursa in care craiul se deghizeaza in urs", 2,
                Question.DIFFICULTY_MEDIUM, Category.HARAP_ALB);
        addQuestion(q19);
        Question q25 = new Question("Cine il demasca pe Span spunand ca Harap-Alb este adevaratul nepot al imparatului?",
                "Gerila si Ochila", "fata Imparatului Verde","fata Imparatului Ros", 3,
                Question.DIFFICULTY_MEDIUM, Category.HARAP_ALB);
        addQuestion(q25);


        Question q8 = new Question("Care dintre urmatoarele este formula initiala a basmului?",
                "A fost odata pe cand noaptea se facea dimineata", "Amu cica era odata intr-o tara un crai", "A fost odata,ca de n-ar fi,nu s-ar mai povesti", 2,
                Question.DIFFICULTY_HARD, Category.HARAP_ALB);
        addQuestion(q8);
        Question q9 = new Question("Care dintre urmatoarele este formula mediana a basmului?",
                "Mersau ei zi si noapte, nu se stie cat au mers", "Si calatori sapte mari si sapte tari", "Si trecu o zi,si trecu o noapte,si trecura patruzeci si sapte", 1,
                Question.DIFFICULTY_HARD, Category.HARAP_ALB);
        addQuestion(q9);
        Question q10 = new Question("Care dintre urmatoarele este formula finala a basmului?",
                "Si a tinut veselia ani intregi si acum mai tine inca", "Si-am incalecat pe-o sa si v-am spus povestea asa", "Si-ncalecai pe-un maracine sa m-asculte orisicine", 1,
                Question.DIFFICULTY_HARD, Category.HARAP_ALB);
        addQuestion(q10);

        Question q13 = new Question("Ordinea celor 7 parti din punct de vedere compozitional este: ",
                "sosirea la curtea Imp. Verde; intalnirea cu spanul, substituirea; intalnirea cu tovarasii fabulosi; episodul cu salatele, cu cerbul;trecerea probelor Imp. Ros, pedepsirea tradatorului, casatoria lui Harap  ",
                "intalnirea cu spanul, substituirea; sosirea la curtea Imp. Verde; episodul cu salatele, cu cerbul; intalnirea cu tovarasii fabulosi; trecerea probelor Imp. Ros, pedepsirea tradatorului, casatoria lui Harap ",
                "intalnirea cu spanul, substituirea; intalnirea cu tovarasii fabulosi; sosirea la curtea Imp. Verde; episodul cu salatele, cu cerbul; trecerea probelor Imp. Ros, pedepsirea tradatorului, casatoria lui Harap",
                2,
                Question.DIFFICULTY_HARD, Category.HARAP_ALB) ;
        addQuestion(q13);
        Question q16 = new Question("De ce este considerata aceasta opera un bildungsroman?",
                "Evidentiaza dstinul unui personaj care, desi nu are puteri supranaturale, izbuteste sa parcurga un drum initiatic.",
                "Miraculosul si fantasticul sunt estompate in favoarea verosimilitatii.",
                "Universul functional integreaza doar elemente ce pot sugera un scop moralizator si o perspectiva realista.", 1,
                Question.DIFFICULTY_HARD, Category.HARAP_ALB);
        addQuestion(q16);
        Question q22 = new Question("Cine iI sfatuieste pe feciorul cel mic al imparatului sa-si incerce si el norocul?",
                "Unul dintre fratii sai", "Sfanta Duminica","Craiul", 2,
                Question.DIFFICULTY_HARD, Category.HARAP_ALB);
        addQuestion(q22);
        Question q23 = new Question("Ce ii cere fiul cel mic tatalui sau inainte de plecare? ",
                "O piele de urs si smicele de mar", "Calul, armele si hainele cand a fost craiul mire","Sabia sa, calul si scrisoarea de la Imparatul Verde", 2,
                Question.DIFFICULTY_HARD, Category.HARAP_ALB);
        addQuestion(q23);
        Question q24 = new Question("Ce sfat primeste fiul cel mic de la tatal sau inainte de a pleca la drum?",
                "Sa nu se coboare in fantani", "Sa se fereasca de amul ros si de cel span","Sa isi ia cati mai multi tovarasi cu el", 2,
                Question.DIFFICULTY_HARD, Category.HARAP_ALB);
        addQuestion(q24);

        ///////////////////////////////////////// ALEXANDRU LAPUSNEANU
        Question a1 = new Question("Ce-i promite Lapușneanul Ruxandei când ea îi cere încetarea omorurilor?",
                "Capul lui Moțoc", "Aceasta va fi următoarea persoană ucisă de el","Un leac de frică", 3,
                Question.DIFFICULTY_EASY, Category.ALEXANDRU_L);
        addQuestion(a1);
        Question a2 = new Question("Care sunt cei doi boieri care nu vor să participe Ia ospățul pregătit de domnitor ?",
                "Spancioc și Stroici", "Spancioc și Moțoc","Stroici și Veveriță", 1,
                Question.DIFFICULTY_EASY, Category.ALEXANDRU_L);
        addQuestion(a2);
        Question a3 = new Question("Cum moare Moțoc?",
                "Este ucis de catre domnitor după ospăț", "Sfârșește ucis de mulțime","Acesta este otrăvit de Ruxanda", 2,
                Question.DIFFICULTY_EASY, Category.ALEXANDRU_L);
        addQuestion(a3);
        Question a5 = new Question(" A cui fiică era domnița Ruxanda?",
                "Petru Ștefan", "Petru Vodă","Petru Rareș ", 3,
                Question.DIFFICULTY_EASY, Category.ALEXANDRU_L);
        addQuestion(a5);
        Question a7 = new Question("Cine rostește replica: „Dacă voi nu mă vreți, eu vă vreu? ",
                "Alexandru Lăpușneanu", "Moțoc","Tomșa", 1,
                Question.DIFFICULTY_EASY, Category.ALEXANDRU_L);
        addQuestion(a7);
        Question a15 = new Question("De ce boală suferă Alexandru Lăpușneanu?",
                "Bolnav de friguri", "Suferea de malarie ","Bolnav de ciuma negră(moarte neagră)", 1,
                Question.DIFFICULTY_EASY, Category.ALEXANDRU_L);
        addQuestion(a15);
        Question a16 = new Question("Cine este autorul nuvelei „Alexandru Lăpușneanu\"?",
                "Miron Costin", "Grigore Ureche","Costache Negruzzi", 3,
                Question.DIFFICULTY_EASY, Category.ALEXANDRU_L);
        addQuestion(a16);
        Question a17 = new Question("În ce an a apărut nuvela si unde?",
                "1840, Dacia literară", "1770, Letopisețul Țării Moldovei","1740, Letopisețul Țării Moldovei ", 1,
                Question.DIFFICULTY_EASY, Category.ALEXANDRU_L);
        addQuestion(a17);
        Question a26 = new Question("În ce perioadă este publicată această nuvelă?",
                "Perioada interbelică", "Perioada pașoptistă","Perioada postbelică", 2,
                Question.DIFFICULTY_EASY, Category.ALEXANDRU_L);
        addQuestion(a26);

        Question a4 = new Question("Care sunt cei patru boieri care-l întâmpină pe Lăpușneanul la intrarea în țară?",
                "Stroici, Spancioc, Veveriță", "Stroici, Spancioc, Veveriță, Moțoc","Stroici, Spancioc, Veveriță, Tomșa", 2,
                Question.DIFFICULTY_MEDIUM, Category.ALEXANDRU_L);
        addQuestion(a4);
        Question a6 = new Question("Câte capete de boieri au format piramida?",
                "69", "420","47", 3,
                Question.DIFFICULTY_MEDIUM, Category.ALEXANDRU_L);
        addQuestion(a6);
        Question a8 = new Question("Care este motto-ul de la începutul primului capitol din nuvelă? ",
                "\"De mă voi scula pre mulți am să popesc și eu...\"", "\"Ai să dai sama doamnă \""," \"Dacă voi nu mă vreți eu vă vreu ...\" ", 3,
                Question.DIFFICULTY_MEDIUM, Category.ALEXANDRU_L);
        addQuestion(a8);
        Question a9 = new Question("Care este motto-ul de la începutul celui de-al doilea capitol al nuvelei?",
                "\"Capul lui Moțoc îl vrem\"", "\"Ai să dai sama doamnă \"","\"De mă voi scula pre mulți am să popesc și eu...\"", 2,
                Question.DIFFICULTY_MEDIUM, Category.ALEXANDRU_L);
        addQuestion(a9);
        Question a10 = new Question("Care este motto-ul de la începutul celui de-al treilea capitol al nuvelei?",
                "\"De mă voi scula pre mulți am să popesc și eu...\"", "\"Ai să dai sama doamnă \"","\"Capul lui Moțoc îl vrem\"", 3,
                Question.DIFFICULTY_MEDIUM, Category.ALEXANDRU_L);
        addQuestion(a10);
        Question a11 = new Question("Care este motto-ul de începutul ultimului capitol al nuvelei?",
                "\"De mă voi scula pre mulți am să popesc și eu...\"", "\"Dacă voi nu mă vreți eu vă vreu ...\"","\"Ai să dai sama doamnă \"", 1,
                Question.DIFFICULTY_MEDIUM, Category.ALEXANDRU_L);
        addQuestion(a11);
        Question a22 = new Question("Scriitorul declară ca izvor al nuvele: ",
                "„Letopisețul Moldovei\", de Mihail Kogălniceanu", "„Letopisețul Moldovei\", de Grigore Ureche","„Letopisețul Moldovei\", de Miron Costin", 3,
                Question.DIFFICULTY_MEDIUM, Category.ALEXANDRU_L);
        addQuestion(a22);
        Question a23 = new Question("Imaginea domnitorul este conturată în: ",
                "„Letopisețul Moldovei\", de Mihail Kogălniceanu", "„Letopisețul Moldovei\", de Grigore Ureche","„Letopisețul Moldovei\", de Miron Costin", 2,
                Question.DIFFICULTY_MEDIUM, Category.ALEXANDRU_L);
        addQuestion(a23);

        Question a12 = new Question("Cine dintre următorii a spus „Crud și cumplit este omul acesta\", despre Alexandru Lăpușneanu?",
                "Mitropolitul Ștefan", "Mitropolitul Daniel","Mitropolitul Teofan", 3,
                Question.DIFFICULTY_HARD, Category.ALEXANDRU_L);
        addQuestion(a12);
        Question a13 = new Question("Ce reprezintă așa numitul „leac de frică\" pe care Lăpușneanu i-l promite doamnei Ruxanda?",
                "Un soi de leac băbesc de care auzise el în tinerețe", "O piramidă formată din 47 de capete ale boierilor schingiuți de el","Un amestec letal din mai multe otrăvuri", 2,
                Question.DIFFICULTY_HARD, Category.ALEXANDRU_L);
        addQuestion(a13);
        Question a14 = new Question("Cum moare în cele din urmă domnitorul?",
                "Se sinucide din cauza presiunii prea mari din partea mitropolitului Teofan", "Otrăvit de doamna Ruxanda","Ucis de cei doi boieri care scăpaseră de furia lui", 3,
                Question.DIFFICULTY_HARD, Category.ALEXANDRU_L);
        addQuestion(a14);
        Question a18 = new Question("Ce nume primește Alexandru Lăpuşneanul după ce este călugărit?",
                "Bogdan", "Pahomie","Daniel", 2,
                Question.DIFFICULTY_HARD, Category.ALEXANDRU_L);
        addQuestion(a18);
        Question a19 = new Question("Cine rostește replica: „Eu sînt boier mare; ei sînt niște proști\" și în ce împrejurări?",
                "Alexandru Lăpușneanu, atunci când este călugarit", "Moțoc, atunci când cere milă din partea domnitorului","Alexandru Lăpușneanu, după construirea piramidei din capetele celor 47 de boieri", 2,
                Question.DIFFICULTY_HARD, Category.ALEXANDRU_L);
        addQuestion(a19);
        Question a20 = new Question("Cine rostește replica: „Femeia tot femeie\" și în ce împrejurări?",
                "Alexandru Lăpușneanu, după ce leșină Ruxanda la vederea „leacului de frică\"", "Alexandru Lăpușneanu, la cererea făcută de soția sa,Ruxanda, de a înceta cu omorurile","Stroici, văzând că Ruxanda nu îl otrăvește pe domnitor", 1,
                Question.DIFFICULTY_HARD, Category.ALEXANDRU_L);
        addQuestion(a20);
        Question a21 = new Question("Unde este îngropat Alexandru Lăpușneanu?",
                "Mănăstirea Hotin", "Mănăstirea Slatina","Mănăstirea Sucevița", 1,
                Question.DIFFICULTY_HARD, Category.ALEXANDRU_L);
        addQuestion(a21);
        Question a24 = new Question("Viziunea scriitorului prezintă interesante asemănări cu cele din dramele istorice ale lui...",
                "William Shakespeare", "Francis Bacon","Thomas Kyd", 1,
                Question.DIFFICULTY_HARD, Category.ALEXANDRU_L);
        addQuestion(a24);
        Question a25 = new Question("Care dintre următorii criticii afirmă: „orice suveran este un simplu instrument al puterii, aceasta având aspectul brutal al unui mecanism care îl dezumanizează pe individul pus s-o servească\"?",
                "Criticul Jan Kott", "Criticul Petre P. Carp","Criticul George Călinescu", 1,
                Question.DIFFICULTY_HARD, Category.ALEXANDRU_L);
        addQuestion(a25);

        ///////////////////////////////////////////////// /////////////////////////////MOARA CU NOROC
        Question b1 = new Question("În ce an a fost publicată „Moara cu Noroc\" de Ioan Slavici?",
                "1885", "1881","1889", 2,
                Question.DIFFICULTY_EASY, Category.MOARA_CU_NOROC);
        addQuestion(b1);
        Question b2 = new Question("„Moara cu Noroc\" de Ioan Slavici a fost publicată în volumul ...?",
                "Dacia Literară", "Curentul literar","Novele din popor", 3,
                Question.DIFFICULTY_EASY, Category.MOARA_CU_NOROC);
        addQuestion(b2);
        Question b3 = new Question("Nuvela „Moara cu noroc\" de Ioan Slavici este o nuvelă ... ?",
                "Fantastică", "Socială","Psihologică", 3,
                Question.DIFFICULTY_EASY, Category.MOARA_CU_NOROC);
        addQuestion(b3);
        Question b4 = new Question("Nuvela „Moara cu noroc\" de Ioan Slavici este alcătuită din ... capitole?",
                "10", "17","15", 2,
                Question.DIFFICULTY_EASY, Category.MOARA_CU_NOROC);
        addQuestion(b4);
        Question b5 = new Question("Ce anume hotărește personajul principal in expozițiunea nuvelei „Moara cu noroc\" de Ioan Slavici?",
                "Să se însoare cu Ana", "Să ia în arendă cârciuma de la Moara cu Noroc","Să se întovărășească cu Lică Sămădăul și să-l tâlhărească", 2,
                Question.DIFFICULTY_EASY, Category.MOARA_CU_NOROC);
        addQuestion(b5);
        Question b6 = new Question("Intriga nuvelei este declanșată de ...?",
                "Luarea în arendă a cârciumii Moara cu noroc", " Alierea personajului principal Ghiță cu jandarmul Pintea pentru a-l da in vileag pe sămădău","Apariția lui Lică Sămădăul, șeful porcarilor și al turmelor de porci din împrejurimi, la Moara cu noroc", 3,
                Question.DIFFICULTY_EASY, Category.MOARA_CU_NOROC);
        addQuestion(b6);
        Question b7 = new Question("Ce anume ilustreaza desfășurarea acțiunii din „Moara cu noroc\" de Ioan Slavici?",
                "Ilustrează dezumanizarea lui Ghița.", "Ilustrează punerea în aplicare a planului de apărare împotriva lui Lică Sămădăul.","Ilustrează procesul înstrăinării cârciumarului Ghiță față de familie, care dornic să facă avere, se îndepărtează treptat de soția sa Ana și devine complicele lui Lică la diverse nelegiuiri.", 1,
                Question.DIFFICULTY_EASY, Category.MOARA_CU_NOROC);
        addQuestion(b7);
        Question b8 = new Question("Punctul culminant din nuvela „Moara cu noroc\" de Ioan Slavici ilustrează...?",
                "Riscul lui Ghiță de a se îmbogății", "Dezumanizarea lui Ghiță","Falimentul lui Ghiță", 2,
                Question.DIFFICULTY_EASY, Category.MOARA_CU_NOROC);
        addQuestion(b8);
        Question b9 = new Question("În care moment apare deznodamântul nuvelei „Moara cu noroc\" de Ioan Slavici?",
                "În momentul în care oamenii lui Lică provoacă un incendiu care mistuie cârciuma de la Moara cu noroc", "Apariția lui Lică Sămădăul la Moara cu noroc","În momentul în care jandarmul Pintea îl arestează pe Lică", 1,
                Question.DIFFICULTY_EASY, Category.MOARA_CU_NOROC);
        addQuestion(b9);
        Question b10 = new Question("De ce anume incipitul și finalul nuvelei Moara cu noroc de Ioan slavici se află în raport de simetrie?",
                "Deoarece analizează conflictul interior al personajului principal", "Deoarece nuvela incepe si se termina cu vorbele batranei","Deoarece înfățișează drumul care ajunge la Moara cu noroc, locul desfășurării acțiunii", 2,
                Question.DIFFICULTY_EASY, Category.MOARA_CU_NOROC);
        addQuestion(b10);


        Question b11 = new Question("Cui îi aparține prima replică din incipitul nuvelei?",
                "Bătrânei", "Anei","Lui Ghiță", 1,
                Question.DIFFICULTY_MEDIUM, Category.MOARA_CU_NOROC);
        addQuestion(b11);
        Question b12 = new Question("De ce arendează Ghiță cârciuma?",
                "Pentru a putea oferi un trai decent familiei sale", "Dorește să se pună pe picioare, încât să poată lucra cu zece calfe, pentru a le da altora de cârpit","Deoarece se săturase de meseria de cioban", 2,
                Question.DIFFICULTY_MEDIUM, Category.MOARA_CU_NOROC);
        addQuestion(b12);
        Question b13 = new Question("Ce cere Lică Sămădăul lui Ghiță cu prilejul primei sale veniri la han?",
                "Lică vrea să știe persoanele care vin, cine sunt și ce vor", "Bani împrumut","Să-i fie complice pe următoarea periaodă de timp", 1,
                Question.DIFFICULTY_MEDIUM, Category.MOARA_CU_NOROC);
        addQuestion(b13);
        Question b14 = new Question("Ce crede Ghiță despre sine după proces?",
                "Acesta este cuprins de o durere sfâșietoare", "Acesta nu își mai dorește să trăiască și are remușcări","Acesta crede că mai are o șansă cu familia lui, chiar dacă este dezamăgit de situația în care a ajuns", 1,
                Question.DIFFICULTY_MEDIUM, Category.MOARA_CU_NOROC);
        addQuestion(b14);
        Question b16 = new Question("Ce poruncește Sămădăul lui Răuț să facă dupa reîntoarcerea la cârciumă?",
                "Să ia copii lui Ghiță", "Să-o ucidă pe Ana și pe copii","Să dea foc la moară", 3,
                Question.DIFFICULTY_MEDIUM, Category.MOARA_CU_NOROC);
        addQuestion(b16);
        Question b20 = new Question("Cum moare Lică Sămădăul?",
                "Se sinucide, izbindu-se cu forță într-un stejar ", "Se sinucide, împușcându-se în cap","Ghiță îl împușcă", 1,
                Question.DIFFICULTY_MEDIUM, Category.MOARA_CU_NOROC);
        addQuestion(b20);
        Question b23 = new Question("Ce meserie are Ghita la inceputul nuvelei „Moara cu noroc\"?",
                "Ciobam", "Tâmplar","Cizmar", 3,
                Question.DIFFICULTY_MEDIUM, Category.MOARA_CU_NOROC);
        addQuestion(b23);
        Question b24 = new Question("Unde se desfasoara actiunea in nuvela „Moara cu noroc\"?",
                "Într-un sat din nordul Moldovei", "Hanul Moara cu noroc, într-o zonă geografică a Ardealului","Într-un oraș din sudul Munteniei", 2,
                Question.DIFFICULTY_MEDIUM, Category.MOARA_CU_NOROC);
        addQuestion(b24);
        Question b25 = new Question("Cine este Pintea in nuvela „Moara cu noroc\"?",
                "Amantul Anei", "Complicele lui Lică Sămădăul","Jandarmul", 3,
                Question.DIFFICULTY_MEDIUM, Category.MOARA_CU_NOROC);
        addQuestion(b25);


        Question b26 = new Question("Care este deznodamantul in nuvela „Moara cu noroc\"?",
                "Ghiță o înjunghie pe Ana, Răuț îl împușcă pe Ghiță, Lică se sinucide", "Ghiță îl împușcă pe Lică, Pintea îl arestează pe Ghiță","Ghiță o înjunghie pe Ana, Lică îl împușcă pe Ghiță, Lică se sinucide", 1,
                Question.DIFFICULTY_HARD, Category.MOARA_CU_NOROC);
        addQuestion(b26);
        Question b15 = new Question("Cu ce scop o sacrifică Ghiță pe Ana, lăsând-o de Paști la cârciumă cu Lică?",
                "Ghiţă acceptă să o lase pe Ana cu Lică, pentru banii promiși de Lică", "Ghiţă acceptă să o lase pe Ana cu Lică, pentru ca voia ca Ana să stea cu cineva demn de ea","Ghiţă acceptă să o lase pe Ana cu Lică, plecând după jandarmi pentru a-l aresta pe Lică.", 3,
                Question.DIFFICULTY_HARD, Category.MOARA_CU_NOROC);
        addQuestion(b15);
        Question b17 = new Question("Înainte de a fi împușcat și-a văzut Ghiță atacatorul?",
                "Nu, deoarece totul s-a petrecut foarte rapid", "Da, atacatorul fiind Lică","Nu, deoarece în acel moment o ucide pe Ana", 3,
                Question.DIFFICULTY_HARD, Category.MOARA_CU_NOROC);
        addQuestion(b17);
        Question b18 = new Question("Cine îl împușcă pe Ghită?",
                "Pintea", "Lică","Răuț", 3,
                Question.DIFFICULTY_HARD, Category.MOARA_CU_NOROC);
        addQuestion(b18);
        Question b19 = new Question("Cum moare Ana, soția lui Ghiță?",
                "Este ucisă de Răuț, omul lui Lică", "Ghiță o înjunghie, după ce a lăsat-o pentru o noapte cu Lică","Ghiță o împușcă, după ce a lăsat-o pentru o noapte cu Lică", 2,
                Question.DIFFICULTY_HARD, Category.MOARA_CU_NOROC);
        addQuestion(b19);
        Question b21 = new Question("Ce semnifica cele trei cruci de lemn de stejar?",
                "Ana si cei doi copii", "Bătrâna și cei doi copii","Ghiță, Ana și Lică", 2,
                Question.DIFFICULTY_HARD, Category.MOARA_CU_NOROC);
        addQuestion(b21);
        Question b22 = new Question("Ce semnifică cele două cruci de piatră?",
                "Ghiță și Lică", "Cei doi copii","Ghiță și Ana", 3,
                Question.DIFFICULTY_HARD, Category.MOARA_CU_NOROC);
        addQuestion(b22);

        ////////////////////////////////////////////////////////////////////////               ION
        Question c1 = new Question("Romanul „Ion\", de Liviu Rebreanu, apare în anul:",
                "1919", "1920","1921", 2,
                Question.DIFFICULTY_EASY, Category.ION);
        addQuestion(c1);
        Question c2 = new Question("Această operă este alcătuită din ...",
                "Glasul pământului și Glasul inimii", "Focurile","Patru parți", 1,
                Question.DIFFICULTY_EASY, Category.ION);
        addQuestion(c2);
        Question c3 = new Question("În total, cele două părți ale romanului însumează: ",
                "14", "13","15", 2,
                Question.DIFFICULTY_EASY, Category.ION);
        addQuestion(c3);
        Question c4 = new Question("Titlul primului capitol este: ",
                "Botez", "Nunta","Începutul", 3,
                Question.DIFFICULTY_EASY, Category.ION);
        addQuestion(c4);
        Question c5 = new Question("Titlul ultimului capitol este: ",
                "Blestemul", "Iubirea","Sfârșitul", 3,
                Question.DIFFICULTY_EASY, Category.ION);
        addQuestion(c5);
        Question c6 = new Question("Imaginea care închide și deschide romanul este: ",
                "Drumul care intră și, respectiv, iese din sat", "Imaginea unei nunți","Portretul lui Ion Glanetașu", 1,
                Question.DIFFICULTY_EASY, Category.ION);
        addQuestion(c6);
        Question c = new Question("Acțiunea se desfășoară pe două planuri:",
                "Momente din viata țărănească și momente din viața intelectualilor", "Viata din trecut si cea din viitor a lui Ion","Viața lui Ion și întâmplările din Transilvania", 1,
                Question.DIFFICULTY_EASY, Category.ION);
        addQuestion(c);
        Question c7 = new Question("Locul desfășurării evenimentelor esete: ",
                "Satul Amara", "Satul Pripas","Satul Ineu", 2,
                Question.DIFFICULTY_EASY, Category.ION);
        addQuestion(c7);
        Question c8 = new Question("Timpul în care are loc acțiunea este: ",
                "Începutul secolului al XX-lea", "Cu puțin înainte de 1907","În perioada apariției romanului", 1,
                Question.DIFFICULTY_EASY, Category.ION);
        addQuestion(c8);
        Question c9 = new Question("Cum se numeşte stilul de dans cel mai jucat la horă?",
                "Sârbă", "Someşeana","Rădăușeană", 2,
                Question.DIFFICULTY_EASY, Category.ION);
        addQuestion(c9);


        Question c10 = new Question("Din ce cauză se ia la ceartă Vasile Baciu cu Ion? ",
                "Pentru că Ion nu-i mai cere mâna fetei lui", "Pentru că fata lui era deja măritată cu George Bulbuc","Pentru că Ion stătea cu Ana , fata lui sub nuc, deşi aceasta era promisă altui băiat", 3,
                Question.DIFFICULTY_MEDIUM, Category.ION);
        addQuestion(c10);
        Question c11 = new Question("Cum era Ion faţă de tatăl său? ",
                "Era mai harnic ca tatăl său și știe să-și adune pământ", "Era opusul tatălui în toate treburile gospodăreşti","Este un familist convins și vrea o familie mare", 2,
                Question.DIFFICULTY_MEDIUM, Category.ION);
        addQuestion(c11);
        Question c12 = new Question("Care au fost cele două limbi pe care Titu a fost nevoit să le înveţe în timpul şcolii? ",
                "Germană și rusă", "Maghiară şi germană","Maghiară și rusă", 2,
                Question.DIFFICULTY_MEDIUM, Category.ION);
        addQuestion(c12);
        Question c13 = new Question("Ce poreclă i-au pus Herdelenii popii Belciug? ",
                "Pămătuf", "Ghioce","Barba-Albă", 1,
                Question.DIFFICULTY_MEDIUM, Category.ION);
        addQuestion(c13);
        Question c14 = new Question("Ce face Ion când merge să-şi ogorească porumbiştea? ",
                "Fură din pământul lui Vasile Baciu câteva brazde", "Fură din pământul lui Simion câteva brazde","O ia și pe Ana pe ogor să-l ajute la treabă", 2,
                Question.DIFFICULTY_MEDIUM, Category.ION);
        addQuestion(c14);
        Question c15 = new Question("Din ce cauză Herdelea se temea de soarta fiicelor sale? ",
                "Pentru că casa lor era construită pe pământul preotului", "Pentru că nu era o persoană bine văzută in satul lui","Pentru că aveau probleme financiare", 1,
                Question.DIFFICULTY_MEDIUM, Category.ION);
        addQuestion(c15);
        Question c16 = new Question("Cum se finalizează cearta între Ion şi Simion Lungu pentru pământ? ",
                "Ion își recunoște vina și George îl lasă o vară să-i muncească pământurile", "Ion acceptă să stea departe de el și Ana","Cei doi se împacă înainte de a se înfaţişa înaintea judecătorului", 2,
                Question.DIFFICULTY_MEDIUM, Category.ION);
        addQuestion(c16);
        Question c17 = new Question("Din ce cauză lui Ion i se dau 3 săptămâni de închisoare? ",
                "Belciug a vorbit cu judecătorul despre Ion", "Preotul a vorbit cu judecătorul despre Ion","Deoarece o bate pe Ana în curtea lui Vasile Baciu", 1,
                Question.DIFFICULTY_MEDIUM, Category.ION);
        addQuestion(c17);
        Question c18 = new Question("Cum reuşeşte George să-i prindă pe Ion şi pe Ana împreună? ",
                "Află informații de la Vasile Baciu", "Află informații de la Florica","Îi urmăreşte noaptea", 3,
                Question.DIFFICULTY_MEDIUM, Category.ION);
        addQuestion(c18);
        Question c19 = new Question("Cum o pedepseşte Vasile pe Ana la aflarea veştii că Ion este tatăl copilului? ",
                "O ține flămândă 3 zile la rând", "O bate trei zile la rând","O mărită cu George Bulhuc", 2,
                Question.DIFFICULTY_MEDIUM, Category.ION);
        addQuestion(c19);
        Question c20 = new Question("Din ce cauză Ion nu doreşte să vorbească cu Ana atunci când Vasile o trimite la el? ",
                "Ion dorea să se tocmească cu Vasile pentru a o accepta pe Ana", "Decide că Florica este femeia cu care vrea să-și petreacă restul vieții","Din cauza nepăsării Anei", 1,
                Question.DIFFICULTY_HARD, Category.ION);
        addQuestion(c20);
        Question c21 = new Question("Care este oferta lui Vasile pentru Ion,în legătură cu averea, după căsătoria cu Ana? ",
                "Îi propune să-i de-a 5 pământuri la alegere, dar nu toată averea", "Pământul cu tot cu casa pe care o deține","Pământurile toate vor fi trecute doar pe Ana", 1,
                Question.DIFFICULTY_HARD, Category.ION);
        addQuestion(c21);
        Question c22 = new Question("Care este decizia lui Vasile la auzirea ştirii că a fost dat in judecată?",
                "Este hotărât să-i de-a ginerelui toate pământurile sale doar ca să scape de el", "Este hotărât să-i de-a ginerelui pământurile din nordul Pripasului și Anei cele din sudul Pripasului","Este hotărât să-i de-a ginerelui jumatate din pământuri şi căsuţa cea veche", 3,
                Question.DIFFICULTY_HARD, Category.ION);
        addQuestion(c22);
        Question c23 = new Question("Unde naşte Ana? ",
                "În șură, pe fân", "Pe câmp,sub un măr","În casa tatălui său", 2,
                Question.DIFFICULTY_HARD, Category.ION);
        addQuestion(c23);
        Question c24 = new Question("Cu ce nume a fost botezat copilul lui Ion şi al Anei? ",
                "Petre", "Ion","Ștefan", 1,
                Question.DIFFICULTY_HARD, Category.ION);
        addQuestion(c24);
        Question c25 = new Question("Cu cine se căsătoreşte mult râvnita Florica? ",
                "Fratele mai mic al lui Ion, Titu", "George Bulbuc","Titu Herdelea", 2,
                Question.DIFFICULTY_HARD, Category.ION);
        addQuestion(c25);
        Question c26 = new Question("Cum s-a gândit Ion că Vasile i-ar putea fura pământurile în timp ce el îşi ispăşea pedeapsa? ",
                "S-a gândit că o să-l ia de partea lui pe preotul  satului", "S-a gândit că l-ar da în judecată pentru moartea Anei","S-a gândit că Vasile i-ar omorî copilul", 3,
                Question.DIFFICULTY_HARD, Category.MOARA_CU_NOROC);
        addQuestion(c26);
        Question c27 = new Question("Unde îşi dă Ion ultima suflare?",
                "În fața bisericii preotului Belciug", "Sub nucul de dinspre uliţă din curtea lui George B.","Lângă poarta casei sale", 2,
                Question.DIFFICULTY_HARD, Category.MOARA_CU_NOROC);
        addQuestion(c27);
        Question c28 = new Question("Care este motivul pentru care George se întoarce singur acasă în toiul nopţii lăsându-şi tatăl să meargă singur după lemne?",
                "Voia să o prindă pe Florica cu Ion şi pretextează că nu îi este bine întorcându-se acasă", "Începe să amețească și se duce acasă pentru a se odihni","Voia să îi facă o surpriză nevestei lui, Florica", 1,
                Question.DIFFICULTY_HARD, Category.MOARA_CU_NOROC);
        addQuestion(c28);

        ///////////////////////////////////////////////////////////////////  BALTAGUL
        Question d1 = new Question("Cum se numește balada ce a fost sursa principală de inspirație pentru Mihail Sadoveanu atunci când a scris romanul „Baltagul\"?",
                "Toma Alimoș", "Miorița","Mănăstirea Argeșului", 2,
                Question.DIFFICULTY_EASY, Category.BALTAGUL);
        addQuestion(d1);
        Question d2 = new Question("Cine este personajul principal în romanul „Baltagul\"?",
                "Nechifor Lipan", "Calistrat Bogza","Vitoria Lipan", 3,
                Question.DIFFICULTY_EASY, Category.BALTAGUL);
        addQuestion(d2);
        Question d3 = new Question("Cine este personajul baba Maranda?",
                "Preoteasa satului", "Vrăjitoarea satului","Doctorița satului", 2,
                Question.DIFFICULTY_MEDIUM, Category.BALTAGUL);
        addQuestion(d3);
        Question d4 = new Question("Cu cine pleacă Victoria Lipan pe drumul parcurs de Nechifor Lipan?",
                "Gheorghiță", "Minodora","Ambele variante", 1,
                Question.DIFFICULTY_EASY, Category.BALTAGUL);
        addQuestion(d4);
        Question d5 = new Question("Autorul s-a inspirat și din alte două balade populare când a scris romanul „Baltagul\". Care sunt?",
                "Salga și Dolca", "Meșterul Manole și Toma Alimoș","Isis și Osiris", 1,
                Question.DIFFICULTY_HARD, Category.BALTAGUL);
        addQuestion(d5);
        Question d6 = new Question("Câte capitole are romanul „Baltagul\"?",
                "15", "16","13", 2,
                Question.DIFFICULTY_MEDIUM, Category.BALTAGUL);
        addQuestion(d6);
        Question d7 = new Question("Ce nume avea câinele lui Nechifor Lipan?",
                "Laica", "Labuș","Lupu", 3,
                Question.DIFFICULTY_EASY, Category.BALTAGUL);
        addQuestion(d7);
        Question d8 = new Question(" Unde este găsit fără suflare Nechifor Lipan?",
                "Într-un cimitir", "Într-o grădină","Într-o râpă", 3,
                Question.DIFFICULTY_MEDIUM, Category.BALTAGUL);
        addQuestion(d8);
        Question d9 = new Question("Cine este ucigașul lui Nechifor Lipan?",
                "Calistrat Bogza", "George Bulbuc","Lică Sămădăul", 1,
                Question.DIFFICULTY_MEDIUM, Category.BALTAGUL);
        addQuestion(d9);
        Question d10 = new Question("Cine este complicele ucigașului?",
                "Calistrat Bogza", "Ilie Cuțui","Iorgu Vasile", 2,
                Question.DIFFICULTY_MEDIUM, Category.BALTAGUL);
        addQuestion(d10);
        Question d11 = new Question("Care a fost motivul crimei?",
                "Ura pe care o avea Calistrat", "Voiau oile lui Nechifor Lipan","Calistrat era îndrăgostit de Vitoria și o voia doar pentru el", 2,
                Question.DIFFICULTY_EASY, Category.BALTAGUL);
        addQuestion(d11);
        Question d12 = new Question("În ce localitate Gheorghiță și Vitoria au întâlnit un botez?",
                "Călugăreni", "Fărcașa","Borca", 3,
                Question.DIFFICULTY_HARD, Category.BALTAGUL);
        addQuestion(d12);
        Question d13 = new Question("În ce localitate Gheorghiță și Vitoria au întâlnit un nuntă?",
                "Cruci", "Broșteni","Sabașa", 1,
                Question.DIFFICULTY_HARD, Category.BALTAGUL);
        addQuestion(d13);
        Question d14 = new Question("Ce nume avea fata Vitoriei și a lui Nechifor?",
                "Minodora", "Maranda","Maria", 1,
                Question.DIFFICULTY_EASY, Category.BALTAGUL);
        addQuestion(d14);
        Question d15 = new Question("Cu cine plănuiește să-și mărite fiica?",
                "Cu Ghiță Topor", "Cu un preot","Cu un român așezat, cu oi la munte", 3,
                Question.DIFFICULTY_MEDIUM, Category.BALTAGUL);
        addQuestion(d15);
        Question d16 = new Question("Numele adevărat și tainic al lui Nechifor Lipan este: ",
                "Ion", "Ștefan","Gheorghiță", 3,
                Question.DIFFICULTY_MEDIUM, Category.BALTAGUL);
        addQuestion(d16);
        Question d17 = new Question("La ce mănăstire a fost lăsată Minodora pe perioada călătoriei?",
                "Putna", "Agapia","Văratic", 3,
                Question.DIFFICULTY_MEDIUM, Category.BALTAGUL);
        addQuestion(d17);
        Question d18 = new Question("Vitoria merge la Mănăstirea Bistrița unde cere sfat de la părintele:",
                "Varsanufie", "Visarion","Onufrie", 2,
                Question.DIFFICULTY_HARD, Category.BALTAGUL);
        addQuestion(d18);
        Question d19 = new Question("În ce localități trebuie să-și caute Vitoria soțul?",
                "Borca și Cruci", "Sabașa și Suha","Vatra Dornei și Broșteni", 2,
                Question.DIFFICULTY_HARD, Category.BALTAGUL);
        addQuestion(d19);
        Question d20 = new Question("În ce an a apărut această operă?",
                "1931", "1930","1920", 2,
                Question.DIFFICULTY_EASY, Category.BALTAGUL);
        addQuestion(d20);
        Question d21 = new Question("În ce curent literar se încadrează opera noastră?",
                "Naturalism", "Clasicism","Tradiționalism", 3,
                Question.DIFFICULTY_EASY, Category.BALTAGUL);
        addQuestion(d21);
        Question d22 = new Question("În ce mișcare literară se încadrează opera noastră?",
                "Romantism", "Modernism","Postmodernism", 2,
                Question.DIFFICULTY_EASY, Category.BALTAGUL);
        addQuestion(d22);
        Question d23 = new Question("De la ce mit esențial pornește romanul?",
                "Isis și Osiris", "Mitul lui Odiseu","Mitul lui Icar", 1,
                Question.DIFFICULTY_MEDIUM, Category.BALTAGUL);
        addQuestion(d23);
        Question d24 = new Question("Romanul inițiatic este considerat bildungsroman deoarece...",
                "Are în vedere descoperirea celor întâmplate și prinderea ucigașilor, de către Vitoria, fără ajutorul altcuiva", "Are în vedere drumul labirintic al lui Gheorghiță","Are in vedere drumul parcurs de Vitoria în căutarea soțului ei", 2,
                Question.DIFFICULTY_HARD, Category.BALTAGUL);
        addQuestion(d24);

        ////////////////////////////////////////////////////////       ULTIMA NOAPTE DE DRAGOSTE
        Question e1 = new Question("Numele personajului principal este: ",
                "ștefan Gheorghidiu", "Demetrescu Ladima","Vasile Gheorghidiu", 1,
                Question.DIFFICULTY_EASY, Category.ULTIMA_NOAPTE);
        Question e2 = new Question("Unul dintre capitolele romanului (menționat și în eseu) este:",
                "Diagonalele unui testament", "O vara frumoasa","O vara de neuitat", 2,
                Question.DIFFICULTY_EASY, Category.ULTIMA_NOAPTE);
        addQuestion(e2);
        Question e3 = new Question("Ela este studenta:",
                "La litere", "La filozofie","La matematica", 1,
                Question.DIFFICULTY_EASY, Category.ULTIMA_NOAPTE);
        addQuestion(e3);
        Question e4 = new Question("Amantul presupus al Elei este:",
                "Nae Gheorghidiu", "Dl. V"," Dl. G", 3,
                Question.DIFFICULTY_MEDIUM, Category.ULTIMA_NOAPTE);
        addQuestion(e4);
        Question e5 = new Question("Cuplul împreuna cu prietenii pleacă într-o excursie la:",
                "Delta Dunării", "Odobești","București", 2,
                Question.DIFFICULTY_MEDIUM, Category.ULTIMA_NOAPTE);
        addQuestion(e5);
        Question e6 = new Question("În finalul romanului Ștefan Gheorghidiu:",
                "Renunță la Ela lăsându-i toată averea", "Se căsătorește cu Anișoara","Renunță la Ela", 1,
                Question.DIFFICULTY_HARD, Category.ULTIMA_NOAPTE);
        addQuestion(e6);
        Question e7 = new Question("În discuția de la popotă se discută despre:",
                "Un caz de adulter", "Permisia ce urma să o primească","Starea fortificațiilor", 1,
                Question.DIFFICULTY_HARD, Category.ULTIMA_NOAPTE);
        addQuestion(e7);
        Question e8 = new Question(" Anișoara este: ",
                "Sora Elei", "O prietenă din facultate","Verișoara lui Ștefan", 3,
                Question.DIFFICULTY_MEDIUM, Category.ULTIMA_NOAPTE);
        addQuestion(e8);
        Question e9 = new Question("Cine moștenește cea mai mare parte a averii lui Tache?",
                "Ela și sora ei Anișoara", "Cea mai mare parte din avere o moștenește Ștefan Gheorghidiu","Dl. G deoarece ce acesta era moștenitorul de drept al averii", 2,
                Question.DIFFICULTY_EASY, Category.ULTIMA_NOAPTE);
        addQuestion(e9);
        Question e10 = new Question("Când debutează acțiunea romanului?",
                "Primăvăra anului 1917", "Primăvăra anului 1919","Primăvara anului 1916", 3,
                Question.DIFFICULTY_EASY, Category.ULTIMA_NOAPTE);
        addQuestion(e10);
        Question e11 = new Question("Cum se numesc cei doi unchi ai lui Gheorghidiu?",
                "Dl.G si Nae", "Nae și Tache","Nae și Zaharia", 2,
                Question.DIFFICULTY_MEDIUM, Category.ULTIMA_NOAPTE);
        addQuestion(e11);
        Question e12 = new Question("Ce factor unificator este folosit în scrierea romanului?",
                "Memoria involuntara", "Memoria voluntară","Memoria involuntara si relatarea la persoana a II-a", 1,
                Question.DIFFICULTY_HARD, Category.ULTIMA_NOAPTE);
        addQuestion(e12);
        Question e13 = new Question("Relatarea și povestirea sunt înlocuite în proza modernă cu... ",
                "Memoria involuntară", "Analiza și introspecția","Înlănțuire și alternanță", 2,
                Question.DIFFICULTY_HARD, Category.ULTIMA_NOAPTE);
        addQuestion(e13);
        Question e14 = new Question("În ce perioadă a apărut romanul nostru?",
                "Postbelică", "Interbelică","Pașoptistă", 2,
                Question.DIFFICULTY_MEDIUM, Category.ULTIMA_NOAPTE);
        addQuestion(e14);
        Question e15 = new Question("Se respecta în roman cronologia faptelor?",
                "Nu, proces numit cronie", "Nu, proces numit acronie","Da, proces numit acronie", 2,
                Question.DIFFICULTY_HARD, Category.ULTIMA_NOAPTE);
        addQuestion(e15);
        Question e16 = new Question("Încadrarea în curent/mișcare/orientare literară:",
                "Roman subiectiv, de analiză psihologică, modern (de tip subiectiv)", "Roman obiectiv, de analiză psihologică, modern (de tip obiectiv)","Roman obiectiv, de analiză psihologică, modern (de tip subiectiv)", 3,
                Question.DIFFICULTY_HARD, Category.ULTIMA_NOAPTE);
        addQuestion(e16);
        Question e17 = new Question("Romanul a apărut în anul...",
                "1930", "1920","1938", 1,
                Question.DIFFICULTY_EASY, Category.ULTIMA_NOAPTE);
        addQuestion(e17);
        Question e18 = new Question("Stilul întâlnit în text este unul...",
                "Împotriva limbajului frumos", "Anticalofil, demonstrând o latură a artei de portretist a lui Camil Petrescu","Calofil, demostrând încă o dată că romanul este o scriitură elevată", 2,
                Question.DIFFICULTY_HARD, Category.ULTIMA_NOAPTE);
        addQuestion(e18);
        Question e19 = new Question("Perspectiva narativă se realizează prin: ",
                "Narațiunea la persoana a III-a, cu focalizare exclusiv internă/viziunea împreună cu", "Narațiunea la persoana I, cu focalizare exclusiv externă/viziunea dindărăt","Narațiunea la persoana I, cu focalizare exclusiv internă/viziunea împreună cu", 3,
                Question.DIFFICULTY_HARD, Category.ULTIMA_NOAPTE);
        addQuestion(e19);
        Question e20 = new Question("Romanul este structurat în...",
                "Două părți", "Trei părți","Intr-o singură parte", 1,
                Question.DIFFICULTY_EASY, Category.ULTIMA_NOAPTE);
        addQuestion(e20);
        Question e21 = new Question("Ce părere are despre nevasta infidelă, căpitanul Dimiu?",
                "Nevasta trebuie să fie nevastă și casa, casă", "Cu ce drept să ucizi o femeie care nu te mai iubește","Dreptul la dragoste este sfânt... unei femei trebuie să-i fie îngăduit să-și caute fericirea",
                1,Question.DIFFICULTY_HARD, Category.ULTIMA_NOAPTE);
        addQuestion(e21);
        Question e22 = new Question("Ce părere are despre nevasta infidelă, căpitanul Corabu, consideat „spaima regimentului\"?",
                "Dreptul la dragoste este sfânt... unei femei trebuie să-i fie îngăduit să-și caute fericirea", "Nevasta trebuie să fie nevastă și casa, casă","Cu ce drept să ucizi o femeie care nu te mai iubește",
                3,Question.DIFFICULTY_HARD, Category.ULTIMA_NOAPTE);
        addQuestion(e22);
        Question e23 = new Question("Ce părere are despre nevasta infidelă, căpitanul Floroiu?",
                "Cu ce drept să ucizi o femeie care nu te mai iubește", "Nevasta trebuie să fie nevastă și casa, casă","Dreptul la dragoste este sfânt... unei femei trebuie să-i fie îngăduit să-și caute fericirea",
                3,Question.DIFFICULTY_HARD, Category.ULTIMA_NOAPTE);
        addQuestion(e23);
        Question e24 = new Question("Ce grad militar avea Ștefan Gheorghidiu?",
                "Ștefan Gheorghidiu era ,ca și grad militar, căpitan", "Ștefan Gheorghidiu era ,ca și grad militar, sublocotenent","\"Ștefan Gheorghidiu era ,ca și grad militar, locotenent-colonel",
                2,Question.DIFFICULTY_MEDIUM, Category.ULTIMA_NOAPTE);
        addQuestion(e24);

        /*Question f = new Question("",
                "", "","",
                 1,Question.DIFFICULTY_, Category.);
        addQuestion(f);
        */
    }

    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionsTable.COLUMN_DIFFICULTY, question.getDifficulty());
        cv.put(QuestionsTable.COLUMN_CATEGORY_ID, question.getCategoryID());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);//columnHack - if you want to insert an empty row, optional
    }

    public List<Category> getAllCategories() {
        List<Category> categoryList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + CategoriesTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Category category = new Category();
                category.setId(c.getInt(c.getColumnIndex(CategoriesTable._ID)));
                category.setName(c.getString(c.getColumnIndex(CategoriesTable.COLUMN_NAME)));
                categoryList.add(category);
            } while (c.moveToNext());
        }

        c.close();
        return categoryList;
    }

    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) { //if there s an entry
            do {
                Question question = new Question();
                question.setId(c.getInt(c.getColumnIndex(QuestionsTable._ID)));
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                question.setCategoryID(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_CATEGORY_ID)));
                questionList.add(question);
            } while (c.moveToNext());//iterate through every row
        }
        c.close();
        return questionList;
    }

    public ArrayList<Question> getQuestions(int categoryID, String difficulty) {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        String selection = QuestionsTable.COLUMN_CATEGORY_ID + " = ? " +
                " AND " + QuestionsTable.COLUMN_DIFFICULTY + " = ? ";
        String[] selectionArgs = new String[]{String.valueOf(categoryID), difficulty};

        Cursor c = db.query(
                QuestionsTable.TABLE_NAME,
                null, //columns to return
                selection,//our selection
                selectionArgs,
                null,
                null,
                null
        );

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setId(c.getInt(c.getColumnIndex(QuestionsTable._ID)));
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                question.setCategoryID(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_CATEGORY_ID)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }





















    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
        ////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            db.setForeignKeyConstraintsEnabled(true);
        }
    }
}
