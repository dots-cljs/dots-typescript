(ns dots.typescript.update-output-file-stamps-project)

(defn kind
  "**Returns:** `InvalidatedProjectKind.UpdateOutputFileStamps`"
  ^js [update-output-file-stamps-project]
  (.-kind ^js update-output-file-stamps-project))

(defn update-output-file-statmps
  "**Returns:** `void`"
  ^js [update-output-file-stamps-project]
  (.updateOutputFileStatmps ^js update-output-file-stamps-project))

(defn project
  "**Returns:** `ResolvedConfigFileName`"
  ^js [update-output-file-stamps-project]
  (.-project ^js update-output-file-stamps-project))

(defn done
  "To dispose this project and ensure that all the necessary actions are taken and state is updated accordingly
   
   **Parameters:**
   - `cancellation-token`: `CancellationToken | undefined`
   - `write-file`: `WriteFileCallback | undefined`
   - `custom-transformers`: `CustomTransformers | undefined`
   
   **Returns:** `ExitStatus`"
  (^js [update-output-file-stamps-project]
   (.done ^js update-output-file-stamps-project))
  (^js [update-output-file-stamps-project cancellation-token]
   (.done ^js update-output-file-stamps-project cancellation-token))
  (^js [update-output-file-stamps-project cancellation-token write-file]
   (.done ^js update-output-file-stamps-project cancellation-token write-file))
  (^js [update-output-file-stamps-project cancellation-token write-file custom-transformers]
   (.done ^js update-output-file-stamps-project cancellation-token write-file custom-transformers)))

(defn compiler-options
  "**Returns:** `CompilerOptions`"
  ^js [update-output-file-stamps-project]
  (.getCompilerOptions ^js update-output-file-stamps-project))

(defn current-directory
  "**Returns:** `string`"
  ^js [update-output-file-stamps-project]
  (.getCurrentDirectory ^js update-output-file-stamps-project))
