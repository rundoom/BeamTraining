package lessons.b;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;

public class MainCreatePipelineWithArgs {
    public static void main(String[] args) {
        //--<option>=<value>
        PipelineOptions options = PipelineOptionsFactory.fromArgs(args).withValidation().create();

        // Then create the pipeline.
        Pipeline p = Pipeline.create(options);
    }
}
