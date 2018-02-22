package org.aksw.gerbil.dataset.impl.aida;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.aksw.gerbil.exceptions.GerbilException;
import org.aksw.gerbil.transfer.nif.Document;
import org.aksw.gerbil.transfer.nif.Marking;
import org.aksw.gerbil.transfer.nif.data.DocumentImpl;
import org.aksw.gerbil.transfer.nif.data.NamedEntity;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

public class AIDACoNLLDatasetTest {

    private static final File DATASET_FILE = new File("src/test/resources/datasets/aida/AIDA_example.tsv");
    private static final Document EXPECTED_DOCUMENT = new DocumentImpl(
            "Israel plays down fears of war with Syria. Colleen Siegel JERUSALEM 1996-08-22 Israel's outgoing peace negotiator with Syria said on Thursday current tensions between the two countries appeared to be a storm in a teacup. Itamar Rabinovich, who as Israel's ambassador to Washington conducted unfruitful negotiations with Syria, told Israel Radio it looked like Damascus wanted to talk rather than fight. \"It appears to me the Syrian priority is still to negotiate. The Syrians are confused, they are definitely tense, but the general assessment here in Washington is that this is essentially a storm in a teacup,\" he said. Rabinovich is winding up his term as ambassador. He will be replaced by Eliahu Ben-Elissar, a former Israeli envoy to Egypt and right-wing Likud party politician. Israel on Wednesday sent Syria a message, via Washington, saying it was committed to peace and wanted to open negotiations without preconditions. But it slammed Damascus for creating what it called a dangerous atmosphere. Syria accused Israel on Wednesday of launching a hysterical campaign against it after Israeli television reported that Damascus had recently test fired a missile. It said its arms purchases were for defensive purposes. \"The message that we sent to (Syrian President Hafez al-) Assad is that Israel is ready at any time without preconditions to enter peace negotiations,\" Israeli Foreign Minister David Levy told Israel Radio in an interview. Tension has mounted since Israeli Prime Minister Benjamin Netanyahu took office in June vowing to retain the Golan Heights Israel captured from Syria in the 1967 Middle East war. Israeli-Syrian peace talks have been deadlocked over the Golan since 1991 despite the previous government's willingness to make Golan concessions. Peace talks between the two sides were last held in February. \"The voices coming out of Damascus are bad, not good. The media... are full of expressions and declarations that must be worrying... this artificial atmosphere is very dangerous because those who spread it could become its prisoners,\" Levy said. \"We expect from Syria, if its face is to peace, that it will answer Israel's message to enter peace negotiations because that is our goal,\" he said. \"We do not want a war, God forbid. No one benefits from wars.\" Israel's Channel Two television said Damascus had sent a \"calming signal\" to Israel. It gave no source for the report. Netanyahu and Levy's spokesmen said they could not confirm it. The television also said that Netanyahu had sent messages to reassure Syria via Cairo, the United States and Moscow.",
            "http://AIDA-Test/0",
            Arrays.asList(
                    (Marking) new NamedEntity(0, 6,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(36, 5,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(43, 14, "http://AIDA-Test/notInWiki/Colleen+Siegel"),
                    (Marking) new NamedEntity(58, 9,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Jerusalem",
                                    "http://dbpedia.org/resource/Jerusalem"))),
                    (Marking) new NamedEntity(79, 6,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(119, 5,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(221, 17,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Itamar_Rabinovich",
                                    "http://dbpedia.org/resource/Itamar_Rabinovich"))),
                    (Marking) new NamedEntity(247, 6,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(270, 10,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Washingtonu,_D.C.",
                                    "http://dbpedia.org/resource/Washington,_D.C."))),
                    (Marking) new NamedEntity(320, 5,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(332, 12,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Kol_Yisrael",
                                    "http://dbpedia.org/resource/Kol_Yisrael"))),
                    (Marking) new NamedEntity(360, 8,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(425, 6,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(468, 7,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(552, 10,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Washington,_D.C.",
                                    "http://dbpedia.org/resource/Washington,_D.C."))),
                    (Marking) new NamedEntity(622, 10,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Itamar_Rabinovich",
                                    "http://dbpedia.org/resource/Itamar_Rabinovich"))),
                    (Marking) new NamedEntity(694, 18,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Eliyahu_Ben-Elissar",
                                    "http://dbpedia.org/resource/Eliyahu_Ben-Elissar"))),
                    (Marking) new NamedEntity(723, 7,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(740, 5,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Egypt",
                                    "http://dbpedia.org/resource/Egypt"))),
                    (Marking) new NamedEntity(761, 5,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Likud",
                                    "http://dbpedia.org/resource/Likud"))),
                    (Marking) new NamedEntity(785, 6,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(810, 5,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(831, 10,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/United_States",
                                    "http://dbpedia.org/resource/United_States"))),
                    (Marking) new NamedEntity(946, 8,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(1007, 5,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(1021, 6,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(1093, 7,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(1126, 8,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(1256, 6,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(1273, 9, "http://AIDA-Test/notInWiki/Hafez+al-"),
                    (Marking) new NamedEntity(1284, 5,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Hafez_al-Assad",
                                    "http://dbpedia.org/resource/Hafez_al-Assad"))),
                    (Marking) new NamedEntity(1298, 6,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(1378, 7,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(1403, 10,
                            new HashSet<String>(
                                    Arrays.asList("http://en.wikipedia.org/wiki/David_Levy_(Israeli_politician)",
                                            "http://dbpedia.org/resource/David_Levy_(Israeli_politician)"))),
                    (Marking) new NamedEntity(1419, 12,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Kol_Yisrael",
                                    "http://dbpedia.org/resource/Kol_Yisrael"))),
                    (Marking) new NamedEntity(1475, 7,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(1498, 18,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Benjamin_Netanyahu",
                                    "http://dbpedia.org/resource/Benjamin_Netanyahu"))),
                    (Marking) new NamedEntity(1558, 13,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Golan_Heights",
                                    "http://dbpedia.org/resource/Golan_Heights"))),
                    (Marking) new NamedEntity(1572, 6,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(1593, 5,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(1611, 11,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Middle_East",
                                    "http://dbpedia.org/resource/Middle_East"))),
                    (Marking) new NamedEntity(1628, 14, "http://AIDA-Test/notInWiki/Israeli-Syrian"),
                    (Marking) new NamedEntity(1685, 5,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Golan_Heights",
                                    "http://dbpedia.org/resource/Golan_Heights"))),
                    (Marking) new NamedEntity(1756, 5,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Golan_Heights",
                                    "http://dbpedia.org/resource/Golan_Heights"))),
                    (Marking) new NamedEntity(1863, 8,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(2072, 4, "http://AIDA-Test/notInWiki/Levy"),
                    (Marking) new NamedEntity(2099, 5,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(2151, 6,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(2255, 3,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/God",
                                    "http://dbpedia.org/resource/God"))),
                    (Marking) new NamedEntity(2295, 6,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(2304, 11,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Channel_2_(Israel)",
                                    "http://dbpedia.org/resource/Channel_2_(Israel)"))),
                    (Marking) new NamedEntity(2332, 8,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(2372, 6,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Israel",
                                    "http://dbpedia.org/resource/Israel"))),
                    (Marking) new NamedEntity(2414, 9,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Benjamin_Netanyahu",
                                    "http://dbpedia.org/resource/Benjamin_Netanyahu"))),
                    (Marking) new NamedEntity(2428, 4, "http://AIDA-Test/notInWiki/Levy"),
                    (Marking) new NamedEntity(2507, 9,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Benjamin_Netanyahu",
                                    "http://dbpedia.org/resource/Benjamin_Netanyahu"))),
                    (Marking) new NamedEntity(2547, 5,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/Syria",
                                    "http://dbpedia.org/resource/Syria"))),
                    (Marking) new NamedEntity(2557, 5, "http://AIDA-Test/notInWiki/Cairo"),
                    (Marking) new NamedEntity(2568, 13,
                            new HashSet<String>(Arrays.asList("http://en.wikipedia.org/wiki/United_States",
                                    "http://dbpedia.org/resource/United_States"))),
                    (Marking) new NamedEntity(2586, 6, new HashSet<String>(Arrays
                            .asList("http://en.wikipedia.org/wiki/Russia", "http://dbpedia.org/resource/Russia")))));

    @Test
    public void test() throws GerbilException {
        AIDACoNLLDataset dataset = new AIDACoNLLDataset(null);
        try {
            dataset.setName("AIDA-Test");
            List<Document> documents = dataset.loadDocuments(DATASET_FILE);
            Assert.assertEquals(1, documents.size());
            Assert.assertEquals(EXPECTED_DOCUMENT.getText(), documents.get(0).getText());
            Assert.assertEquals(EXPECTED_DOCUMENT, documents.get(0));
        } finally {
            IOUtils.closeQuietly(dataset);
        }
    }
}
