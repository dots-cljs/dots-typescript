(ns dots.typescript.invalidated-project-base)

(defn kind
  "**Returns:** `InvalidatedProjectKind`"
  ^js [invalidated-project-base]
  (.-kind ^js invalidated-project-base))

(defn project
  "**Returns:** `ResolvedConfigFileName`"
  ^js [invalidated-project-base]
  (.-project ^js invalidated-project-base))

(defn done
  "To dispose this project and ensure that all the necessary actions are taken and state is updated accordingly
   
   **Parameters:**
   - `cancellation-token`: `CancellationToken | undefined`
   - `write-file`: `WriteFileCallback | undefined`
   - `custom-transformers`: `CustomTransformers | undefined`
   
   **Returns:** `ExitStatus`"
  (^js [invalidated-project-base]
   (.done ^js invalidated-project-base))
  (^js [invalidated-project-base cancellation-token]
   (.done ^js invalidated-project-base cancellation-token))
  (^js [invalidated-project-base cancellation-token write-file]
   (.done ^js invalidated-project-base cancellation-token write-file))
  (^js [invalidated-project-base cancellation-token write-file custom-transformers]
   (.done ^js invalidated-project-base cancellation-token write-file custom-transformers)))

(defn compiler-options
  "**Returns:** `CompilerOptions`"
  ^js [invalidated-project-base]
  (.getCompilerOptions ^js invalidated-project-base))

(defn current-directory
  "**Returns:** `string`"
  ^js [invalidated-project-base]
  (.getCurrentDirectory ^js invalidated-project-base))
