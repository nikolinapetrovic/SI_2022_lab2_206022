# Втора лабораториска вежба по Софтверско инженерство
<h3>Николина Петровиќ, бр. на индекс 206022 </h3>
<h1>Control flow graph </h1>


![cfg](https://user-images.githubusercontent.com/86936662/171815872-ef1cbdb6-0c2f-4a00-890e-135cc9b94d21.png)

<h2>Цикломатска комплексност</h2>

Цикломатската комплексност на овој код може да се пресмета на 3 начини. И на сите 3 начини се добива истиот резултат . Најпрво може да се избројат регионите како што се обележани на CFG графот на сликата има вкупно 9 значи цикломатската комплексност е 9, исто така доколку ги изброиме сите јазли добиваме дека има вкупно 24, а ребра има вкупно 31 => 31-24+2=9. И третиот начин е да ги изброиме јазлите кај кои се проверува некој услов, тоа се сите јазли обоени во сино на графот, вкупно се 8+1=9, повторно се добива 9 за цикломатската комплексност.

<h2>Тест случаи според критериумот Every statement</h2>



![everyStatement](https://user-images.githubusercontent.com/86936662/171816689-4ff41747-f083-4652-992d-3e1fe66e2970.png)


<h2>Тест случаи според критериумот Every branch</h2>




![everyBranch](https://user-images.githubusercontent.com/86936662/171816830-4801a689-4057-48a1-9899-3e099b93c0fc.png)


<h2>Објаснување на напишаните unit tests</h2>
Најпрво може да се каже дека за да се тестира секој јазел од графот односно да се изврши every statement тестирање на кодот би биле потребни минимум 3 тестови, бидејќи има 3 независни излези од програмата и најпрво ќе пробам со тестовите да го опфатам секој од нив. 
Најпрвиот тест ќе биде празна листа, бидејќи доколку условот прв што проверува дали листата е празна биде исполнет се фрла исклучок и програмата терминира. Со тоа ги опфаќам јазлите 7,8 и 40. Вториот тест пример треба да го опфати вториот излез од програмата односно да биде исполнет вториот услов што се проверува тоа значи должината на листата да не биде квадрат на некој природен број, за таа цел може да се прати било каква листа само е важна должината, во овој случај јас пратив листа со должина 8 при што ги опфаќам јазлите 7,10,11,12,13,40.
Со трет тест случај може да се опфатат сите останати јазли само треба да се внимава секој од условите во фор циклусот да биде исполнет барем по еднаш, додека првите услови што фрлаат исклучок да не бидат исполнети. Тест случајот во кој се праќа следната листа : [0,#,0,#,0,#,0,#,#].
Се проверува дали листата е празна, се поминува јазел 7, таа не е па се оди на линија 10, 11 и 12 , бидејќи должината на листата е 9 и нејзиниот корен е природен број и тој услов не е исполнет па се продолжува на линија 15 и 16 каде се иницијализира променливата I се проверува дали е исполнет условот за циклусот, и бидејќи е се влегува во него. Се проверува дали првиот елемент од листата е различен од #  бидејќи е, условот е исполнет и се продолжува во кодот од иф условот, каде се проверува дали i при делење со коренот од должината на листата дава број различен од 0 и предходниот елемент на листата е #, или дали i при делење со 3( коренот на должината на листата) е различен од 2 и следниот елемент е #, па според тоа и овој услов е исполнет, после тоа има уште еден услов кој проверува дали е исполнет само првиот дел од предходниот, и бидејќи утврдивме дека не е се исполнува else делот односно нум се зголемува за еден. Потоа се проверува следниот услов и бидејќи и-3=0-3=-3 е помало од нула условот не е исполнет па се преминува на следниот кој е исполнет бидејќи 0+3=3 а елементот од листата со индекс 3 е # , па нум се зголемува за уште 1 и добива вредност 2 па го додаваме на новата листа. Сега циклусот почнува од ново, до сега ги поминавме јазлите 16.1 , 16.2, 17, 18, 19, 20, 24, 27, 30, 31, 33, 16.3 и од ново почнуваме со циклусот , ќе прескокнам до делот каде што се проверува за елементот со индекс 4 од листата, бидејќи е 0 а елементите околу него се # и над него и под него во матрицата формирана од оваа листа исто така што значи дека за овој елемент ќе бидат исполнети сите иф услови од фор циклусот и ќе се поминат и сите останати јазли кои не беа поминати со предходните елементи тоа се јазлите 21, 28. Додека за следниот елемент кој е # ке биде поминат и јазелот 36. Кога ќе ја поминеме целата листа со фор циклусот 16.2 условот веќе не е исполнет па преминуваме на 39 и конечно на 40 каде што ја враќаме новодобиената листа.
Тоа беше накратко опишано на кој начин се изведува every statement тестирањето и зошто се доволни само овие 3 тест примери. За every branch тестирањето последниот тест пример треба да претрпи мала измена за да го опфатиме и случајот кога првиот услов од for циклусот не е исполнет односно гранката 19-27 на графот. За таа цел го зедов следниот тест пример [0,#,0,0,#,0,#,0,0,#,#,0,0,#,#,0]. Со што се опфаќаат сите гранки како во третиот случај од every statement тестирањето, вклучувајќи ја и гранката 19-27 која се поминува со елементот на индекс 3 од листата која се задава како влезен аргумент. 
На овој начин се изведува и every statement I every branch тестирање и на тој начин може да се утврди дека кодот е валиден, односно го прави тоа што сме го замислиле. 