package yunogum.MetricCalculator;

import java.util.List;
import java.util.Map;

import com.github.gumtreediff.actions.Diff;
import com.github.gumtreediff.actions.TreeClassifier;
import com.github.gumtreediff.tree.Tree;

import yunogum.PythonFileData;

public class AnyDeletedMetrics extends UniversalMetrics{
    public void calc(Map<String, Integer> metrics, Diff results, TreeClassifier classifier, PythonFileData fileData) {
        // MetricRunner.dlog("SRC---------------------------------------------------:\n" + results.src);
        // MetricRunner.dlog("DST---------------------------------------------------:\n" + results.dst);

        //#TODO filter these within range
        metrics.put("anyDeleted", filterRange(classifier.getDeletedSrcs(), fileData, true));
    }



    public void putHeader(List<String> headers){
        headers.add("anyDeleted");
    }
}