package code.kotlin

class FindCommonCharacters {
    fun commonChars(words: Array<String>): List<String> {
        var charCount = IntArray('z' - 'a' + 1)

        words[0].forEach { charCount[it - 'a']++ }

        for (i in 1..words.lastIndex) {
            val wordCharCount = IntArray('z' - 'a' + 1)
            words[i].forEach { wordCharCount[it - 'a']++ }
            charCount = charCount.mapIndexed { j, count ->
                minOf(count, wordCharCount[j])
            }.toIntArray()
        }

        val res = mutableListOf<String>()
        charCount.forEachIndexed { i, count ->
            repeat(count) { res.add(('a' + i).toString()) }
        }

        return res.toList()
    }
}

fun main() {
    val sol = FindCommonCharacters()
    println(sol.commonChars(arrayOf("bella", "label", "roller")))
    println(sol.commonChars(arrayOf("cool", "lock", "cook")))
    println(
        sol.commonChars(
            arrayOf(
                "cxizlxaeicvxwiaqebzdzjfqmtjtrbnrehrisntpsmsntpsndsvjthgnubvekkxqwzknqqrcutenoeseqakkldnktsqpbhkklazy",
                "zohpatikncppgxcjpzazcwjaqbhuaokxabfvfrrbyvgjimfujzvsebjbvegwgapdixvzblrkqpzrdbtxlpultojuhwzqetvplpdf",
                "vutkluptjbjaahtaweadgtcvasaujlwgqrufojtakworsxlzlkkatwrnqxmtfbcmfjbbnpyitirnnvtmtlqxfzalycigeeeqtaqu",
                "intoasbpbflhukiroofoqzpeksolynoytjfbcmeoeamxxbnlfgdwjwpenhufllcrnjrxttbevqdxqmxyvvguuliqfvbdalpkbawy",
                "zizxutlyzcwwklwndwmgnquzfwaodungcpkhudujtfgcfpgsaatsflcxafskssjxhjhwexxgiwefozusudcxuwkroogopgcsjzgl",
                "lyesyttpoqgrplyxzpqqajqqafygvyuzkxwggpmpuvrlkgdzowyhhxjopcxtanieccgwzursvnvguwikgyszbybqthewgouzerpz",
                "msfudeekbpluzevvypmamrqhrdmjqclqsteprmpszzoigjuzrcofmtrasaokotykharcpddjufoufzoifrqlfpsfdemnptjxlaxv",
                "qcarngpdtsuakowbmkgnwmfjmjwmxkxeqpxyhcjnsrskuequgqlwppwwcgisepfnbxirpgynyymdqbzrbvmwupsvzdmylccylxkm",
                "opwvbicxbdcovfrlhxmqhytujlknkxazqooghibtajaojhssbbajzcqlyacbespfluawhygjwkfowcueylpogablbmmuhdkewhpv",
                "fuutvjfdwhhndlxuqxulutzepevejifzvkudvqqvkxhpkfixtrgugzyminanprvguibaocheuxqxhvxibyqjsomjdvnvxezmsorp",
                "myhbmytkraqvtvgygpmscwcqqtkzbhyyggprhovjpjyqijdrgunyxymksocskvurczbsmdelbusuqdpofskzamhklmhrrgdjqtge",
                "ynwjqmhdsstcahzioqwnlftajrnbhdembeitsczfqoztjhfaxkpojhawgtsokgzzjfyonkcsisvxqodducsnhgkclvgnyrbbfkuy",
                "qgigwnrfatzcrnrhvnczfnlcjratbkbcvnegnodqqbyuzghsbmieamvwqqlrkidicnmkjrlohjtrgkbitnpxzwsxqzbdidzaveyx",
                "bmfvderczfvirbashmriyzfrkwceebvwhpyjnlahoyzcuitkcezpnavgloycjxjaqrasckgfkwakplyyjkbzcdbhbrehwpjihngy",
                "ykcazotwzfalckzeyjxujrkvukxsjuxgilopctogqmrnvzhpsnseadhifhhjloawubvmiqvyzmynrvisnyjupjwgfzdhctrgmiov",
                "pukyolrguitgcnzddpwwpqxemttsujduonbjovqngzpbaifivisqojqztcyblerocqottjayafypdzzyvymlkrdihcvjqpawouiy",
                "ejuejeqynodrspsndrmpjkcixvjxogoprzjgyxnsctcovaubwbkqaajtfjvcmrnrkcmvspvnwesitvvnimezjcgyrjimcwnetmll",
                "xujtbtnnacezhqbzrpelbgbsnmwvuamfbvxxjjkcynsojrhlebzeptnloqgyxlfdnqcdwxfxazaxcmxkcrneiqheycgvsbgltvid",
                "qldmyynkbixpfjsdvlgfngzrhdijjxeehzebaquekjfpxofxvugnftclfcczvoqigfkievyvormswqpwvqbnobvhqjadiavgdqzw",
                "bncxmbpwuywvnaeecphfwvbpuvvknxkzsfeykeaejdrcitwtioyenzxjfsiagbsunnokmjclaffcoozgayuhjiypcmeijghndzjn",
                "rerjcjeqjvdyzzyybnbwzheozqrvjbjegzfvgwuepexsaimjtfcghoaxdsdlltahlkzneuevgnackjoohginvpqcbjxbexbqfgyc",
                "vgsskznernyntiwofhoqkntgeclhhgoyihgeeodumqnwxwrhqmgnhlubftwjwoijfymfwugxqsxwsytjctuqcxcxuhlzcllhyfri",
                "lgzsgpurzxthlzehntsvkycdavippybpnkbxjpkzdlkyxffllbydeziobquhotpbshtsoeuyoutytdyduoadxeancbnysuxzorad",
                "zjfekgidfvzzbhzoksizpcylqigaacvgqcgmzntxzrtmbucnmmrgbkbexuunvyqqnbrgnottufxpylvkbmqdocstubrfgwuqkdcn",
                "trlgbgboeszlfgadqoxwpjtkwpcrnticpxgdgyxmibjdhzrvkqzajqjhozzkiqffnwcqyuexdselwfumyyvvamiizwvztgimzgbp",
                "mlimwoskddyxunxgssfjgfcdrzbswtiyqdyamnikfhfdvfbhnltkgatdttxprfgafnufaqpzbdgmbnogesvuysqseuckbqcmpzdl",
                "nvlxantvgwrtmzzvutdjvsfftnjthfferdhejcfmhvvhunxzsijvyfigonnfrdzflvbsxnftjfxfczxoayrkouwycwvmhsfhfmyt",
                "oijzdasbaiylwkvqqmbklzbmajydkpwaglivwqqhvljvjxglkslutxjrivdgpazioaiaoobikvxlfjmizipgkhvughuoxowykuqr",
                "epyfwunrkauzbbsvuaoflozsaavyjkcuusjndiyqeatigykkbvoihfpuljqdjckemlslgdfkvmydateenrvzhavtsjrqobvvyaqo",
                "xxkfwqdzwffllyqczpnkulqzuokoogssiqyzaxehyomsgvaxzqnzflzwzzavnmibtzddwrlnuzljtojecrbbjucgyijjyinwozrj",
                "ywpjlyfbwsiognlmkszyzpxcglnlacldfjcuziemxtdeepbwewwlxfqquomlsfieomdmsiqavuqrftydpomufvewlbqvlojdmgfg",
                "xkceantgnjkiybxcvplnpxwimnprwbtwasjquwmqkrakctprjmnfdpsqjlwxuzwykuchddgsdlccgyqpolckeecgfvejderxtngo",
                "lvutlzkxcevzpqszqgdayhnyllkgrvbimougbdmgbqdzwtrddgxkwqczegfnkigphwghsosruryztixvqgrxoziiubxwoehtqoun",
                "pzorupuimoaxlyfrwweufewwucosqnrirupklqjekyktreaxgaxaqgncmwwkgwprybafuwtsagjyrawbpqeqztzdrmcpzhxcomjh",
                "eyzcwioqzvcmtxvtxxulcnxwewewbpgjyzpgcouplsctjipuwiutxhdtczetfxnnkifkvwhiamxjjppaubbwxvqrmpymzvgoevlg",
                "uasbblgcquaqcormaeupxgykzrjypwccgwbypsvxlnswbnwlixvjlzkirnlzzibkicrtlupwtoebxcemwvjkidvmlivouxiynnal",
                "nasxfhzdreqnspwuourravhdbjchfulzvgquccvevbodabeievzgvzegubfipdeoaffrgnyjdzshvtiotmjieezilwwkqhqlivts",
                "dimmqymdjhbsfkegyxfmejnczmfnmrajcxfuqymxexhmynyrxkjgpbdwmwdsckzcjymoasudsksobvebaefjngzvzqkplpoehfjh",
                "sejxqwviqhlkbartmgwsvuwruemjqpaepilbyaerwjziyecmmmeothvosfvxcyiecjxkdxfqfnmmzahndoduzhutzuhfpuszcuhv",
                "irhbaqsjmsjbwvnxhtqgocwhqqktfiquoveymoqlrussuizzmwipoudtlnrajonjmcmoqmvyqwbeznrqwrxkphozzplmnnwbygio",
                "nrvzlftzhwwfeckjtoknipjpokzwnbacdauzfnvebpapoqpyseaeyzicfsaljevtkwgivtxfjrrmocsmvimctfvrboawndjjgumy",
                "droxndceqfcpkqgmkrdeewtdxxmsgimnzsrzojkqwhavlzvpvmrtlttxhrtehcapcncxvfgxkpatabowpigzldstfbsiqwezvbww",
                "uapczwtmobvrzurhsxkodzgouxoeffgerxtxkvyaghvtzqzshqgmrrtwxkfxsisdhonyvmescqxqiltaumknxycdkzdijwkaaotg",
                "ijmsesoptcjvpducnyahcxsojqkrzjbcqwzzxfgacynhxknvkaosrnolagfiutvrwaqsxmrbofmduxrxxnxmxlaccxqzlbvrxjra",
                "veksvbkqchdgnkneqdlslicomlnnceijpsmgtaehnzsvghfabvdiwzjgdecjxsdcestuemlobekumtaxssdgzftxvjjrnhhdyfzj",
                "xtotdktrxgnvmqzxchalgdywlysribmxxjhgznotfjgtrxhilkrlsdofswlyflfzgxerykdgqdmxkyxjlopolafuznutdbzygzlx",
                "eiehlrjgmquyephjgqlmpvnxzbownzdazsyspurryzqribvlzyjigcszsuhxgtyycfwlakzaixmqorrzejooqkmrdggmkghbkesj",
                "ktataiirpttwjzyypfjsquylawvjnjtqpveynzftkxohlcwtprhvpohmrhhnhnjyjsgkgouiigliduyioqkaaavnyxpkabqehelc",
                "gacnwampmavvepmrnztqvmggpxcnbcioicwtqgalidjuqmzvobyrrnskhhccftqqxgakgwcsonkbasmpsyvixreqjyrjknwlxbdw",
                "mbvxwmfrudiujaxqnkvjwwexnphttfowstanntyfzgpztcqzzhxqhkvvqipbtqsbmjgjthyqnsbxnipvhpztlncvuevhkpbpwkxo",
                "udajfrqvjszwaqgzbblnuooxmvbtejsnhlllqajbjrgzzxooefazffzujkymnugfzxyaolprcksntajgvcbcycqzhqvvozvdoelh",
                "okqaorpeduegmjdalsmoybbdgnleozmvfvtnvzipghruarrzqqejzuzdflkjoewpzarevfrxhjoougnlccnztocotinvmebuwmtf",
                "dxrojfhlemlupcyjguhymianoxilfxgcxbfdqixvmgqeabpagmfgemhbeppewoowsljutsptrcvvtzaeyqffwbsoipwebjhssigj",
                "wssourljhoocgyrujbjgawbapexglevdtqkgdokwphlzyteycpzswblmxvxpwlkcjuiwgkppgbioyqngqjnasbofhbyrfxszhqdr",
                "hhvpfphtxnyiemyhynlwyyyjgtfsrljoglclidyxvvtrssqafossxmobcnvztpafkpuaruwzlsciirrdapmllqifqhyhaimsjrbz",
                "vjkpztaauscdovjvkyborqlaxcyjzsmgfourpyyyhtapxfxhbyyudjpdwtuwnlkfinmwghqwtvazsdkbzlzaamshyaubektppojw",
                "fjyxxtkawexosprbayitlqzyjisrdzueijomhbhlizxlnfkpapjpdyzpqemepwescbnfgghulgraenudwysqhsucjlqgujdcjjyr",
                "nsnwrrgffjtpjqufcuhndbukfpmelifvuasyyroamcjzrtvkzomxbkwlsrvmnzedhrwwgvvntxmmvzagugdzogrlxymtkdjzuhdq",
                "wcwvstsjugpaxdrlrqdctufwijfjstnwfdfgcixsvxynwrzxyojqwrmmgqqgrwumcfxgzifgdlrqdwoltdtfoyyalzlnyziblpek",
                "qgjnrxxigdlryhbknxmaqexsjabtrofromjudzyubsyxjcifjjyqchgomlgcpxwvxxdrrpcfbuuijxdwukwumdvunbnlkmobxcsc",
                "mueqpapmemzbrklixyhmubxhdxhzzhbakytecctcqahmruljqsleaedvqyybrkxmshliywgxlfuhxpbjmcwpoqrhbkrdlxuphncf",
                "djbzfihlhqeswuegjyxxthddepzqflfnhkyckjenevfcbxagwvxqplmajqctayqlbdnlgbptmaosepfbdcxkptkaxnntnxzqozxv",
                "jtvuxxetpjvdncairjsvzphhblrxvpvficztkgphkspptvzdhrqphhydgcnysuwzkxalsucwmfsqxbkgkxaxkajesiyywgecsxai",
                "cdpbumrfxufyzpxdhfkuogbgtuwoqwmxffomzkvfuicdahjvirwqkrnseiltuetvtbxkwmprbziietgrvbzwmgxxmsjrbvmyulks",
                "cyyktczgcgjxekttrkmigjqrawlnlpudzavedpsketuoerledqftnkrkralkpxtzvgetimtztwpqrwvwfsriwlemljgqqagokrus",
                "vlkzbmcrdvbrutlbtvntvdplgsdnxhjskvnptsjdepnuiivpefjnjhprqjssgsoemeiwuqrggchgkjabcqxrqaqohkruhbjnfcvt",
                "uaqbfmjjrnqfvvfsuybubxkkjgxacwnjbrwmnpcbbnlriyaqcfeekdosmaohfmplrltoxflmhnsmuatdvxwyzrwlszlvwxzgvvxg",
                "hkvdhjzwhykxsnqdlrhgfojcpwlughuqbpsznsgffzuergznmpdksgycrqmnruihbbavuosjvnwxxpmnautiudmgalztxoczqoka",
                "kpkbaedgiyzaroyxsfakegglmwgfxoreoaycxvjtjnzkdidjglzhlnzsgfoemkcdpkcuigafemvuvfjcdtqpfpkyjuneilabthcx",
                "ebycypouydpptxjsggahkbvnchwlegdfdclkremybnomyfjnnzjvwrgpxdymtwxhuvgajquqgfqcpdbrmfwwjpvxgrxcabewwqjn",
                "xnhqueqqpvsayorjsgudtghmdfgycbuakukmdequrezaqtuojmicaxcpfkfxsoctgrbziicpenckxitdsxevmgzctgsdhkbxjsfb",
                "podtoqisfeuuydukdjrhzjiafupdibkcbgrkzfafilrlwwvchfwksqyrwizakxxmquwjboqqkprdxwblzzgsrqviyeaxvckuqmxx",
                "jegfkvmxouyukzdpwnxdaovvfavxdmgfaotqbijxdwkyxzqjpggtwhiguefekcgqrzlyofodjoittschlurcdamlgjwwsvlhicfx",
                "omhmmohcfdmzkaahbmwwnmuclhvfnjsfozxcndelgyibfljbxldpjuprpsmjzfrcrdmeaqlnahcphjvionmidxuzwjziggsrymuq",
                "urtoodmqotufmyrgkvvlplcpqrmgjqtwnsxubzxzcdyrfurhlzhvycgoivncoteplodztiugoncputkbelracwgwqsmzumtnqazx",
                "zmjlpylrliiwbihsjsanaazofhsjagkunaanexpnrkxvwnmfneaficratlgvgmojwzonpczjbybynmiqsklagfyksrxveetmokxt",
                "saeqogjrdooixctqlgalayioezshxoxmzwuzgsbnkktlogfvvsajuwoepqvlpjwqcbgnsmmlbusgirlzzbngiiagzvwgxlureiyh",
                "bteycsnlukwjaxqgwxlqrcyxueykznnxjzpkpeafuoorjrymrqevfaqfczpabmolgamoegiprphpnuyswvmreruyacmqipwulphn",
                "jaboldifpcohlpigojohzlrokaqkjpawhylpzktmwsqqylfddjcobbhiudsuermrbfklqowvqshwgrhqqutovxdqujaxrapmgcvn",
                "guugpqwaktbjuowrwqprgmhlgmiqxifbjvjyfvhtmpydasmgitzzzcgnctyckzsohlwmfyopsdemdblrkhkjhubmqpcnqatijgdv",
                "ugvhvmurdhblohmvjxbdxemzqrwxekbbogjsfebjucoxxqmlzusvihpxuettmhjraroyklrxsjtwacwrfgxfvetcxribrshtbrzr",
                "luxgfrjcsqmurdlzkactiqvmximtiskkwzydehsthhyplbnhrcccczayczwolxszolqgouaftebwpapxukeqcyjokvvzlwpfnjlu",
                "izskskqbrrmvomzrcjezunmzchljddiqqznhqlgeycpzpdzkgwlqplewpqyfskitalevfsuyytdkvgfqzqgoxsbsleitmwpofwax",
                "wvkmmniagtilhzxyjdiygqbzanjqrhfxmmkzhdtkfebexdusgjszwamcvxyveansmqpnfmydczzpmxtlxkbpljcjxrtrrftiepsg",
                "oruykgciordgafzgnecforlmsffpvqwhciawolaxwqyxuhgrkzkkyacxxrcwtquaewnwssroctfbkuigrlutetjjejkbgnphtiwt",
                "uwympkgqzyevazokvbykabpmgfandumwsmqfiovjwougsglifctzeifnvgiikuereayvvilzrcwphkhhfxcxhnmuukwqrilpicxg",
                "iibipamzyznjhicfdibpdnbxynsazmtgszimvmnlkzeidzzjynoojcuuyfljdwsnjupoujuhwbprllxciruyijvxxhpzscgormur",
                "wcvtavkujkgsjvxqnmvoiocyxqcmvargirtngaeubransrjzynzqywtudugdwyeupnraptwjjffyonrqeuxeqgyreqhelkhvxebt",
                "cnqzxqrnztogafefllnooldvzdsuvqfgwwpouvgqcmmlxbksqgjddsouzupaxhafjogryatvnsrmgtlwgchdogdoupsbsbglhdzd",
                "ufnneunxpecjduyiwdzjrwirtgffhrwjiehhjblrcevtpvjxzpkrkprbxgcnvvqbayyrjvudrtgdhpugljpdbziqczwtrnuxlaht",
                "ljtbzjgnemfjdkrtzmtbypymrpwckgksaxvhivsylevfoznwnwbrjfknrrxgqfxvewhqxoiexlzgdcpanxfzupztzemkbezpjbpo",
                "cxirqwcyzjdjqqgotntbxyobemvskwwpfchskzuewaolcambienmubdanhkuxcgenkypzrdlxfsohmwnoynbehgcxztrnxrmfhst",
                "tihyhgzhskgzfhxatpronphslvsyhpcttwqqgdydcbzsmeoujlbhcnclaohphekvwuhqfquxpcktxqlxpfhfehksocgvfvxcwery",
                "btpuhxgofircivkkjqzdjxreazftdtnyylobbbxgswskewxyycnsivjdrwijzkzhpyucdfikwqshookugwrcedzafxheuhpichut",
                "tvqttikfjrbskmwjqtbyavmovyzeeagtjxxhklquyfruwurbsifvvywusfqiblokjpqbeqmawilxgmvhmmimyfrqfhomcbjsxvgd",
                "rgzrgbihpdckrqarsylkklmnevpgqhitnzyaigntuijzkxtncqhksmunyjrzmlwmldlhfthajvklatvlcgfoewzlrufmuipnzihm",
                "rewrgpzcfycoclwwzctcubmibztupbgbdsqpvgidgpyzsrplrzsftreapamshhchojthagpgyefgmnlmcactiapvnhnqhytmznvr",
                "smlywmmixzagjnyjyftddnajcwtxzsgzciqyzoojkutsagnmmwxfdbhqhyzvdufhfbpeqjvdakshjblgjdahpotznhuessuiklae",
                "vqwxiktrzpllggpfhyzxpvsadeteueapiixzmorruxheofxuzexbktrzyuehqwflufvwqisffnotrirxbcpaconyfdaykglfxavp",
                "airidyzwwudqytasdzwiexpiyzgnhgclzlyojxrzptucbkfksarxkcvqlhxurlzkjbarurxolakwihgspsiggyyvgiuhphkzezaw"
            )
        )
    )
}