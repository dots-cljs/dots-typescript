(ns dots.typescript.update-bundle-project)

(defn kind
  ^js [update-bundle-project]
  (.-kind ^js update-bundle-project))

(defn emit
  "**Parameters:**
   - `write-file`: `WriteFileCallback | undefined`
   - `custom-transformers`: `CustomTransformers | undefined`
   
   **Returns:** `EmitResult | BuildInvalidedProject<T> | undefined`"
  (^js [update-bundle-project]
   (.emit ^js update-bundle-project))
  (^js [update-bundle-project write-file]
   (.emit ^js update-bundle-project write-file))
  (^js [update-bundle-project write-file custom-transformers]
   (.emit ^js update-bundle-project write-file custom-transformers)))

(defn project
  ^js [update-bundle-project]
  (.-project ^js update-bundle-project))

(defn done
  "To dispose this project and ensure that all the necessary actions are taken and state is updated accordingly
   
   **Parameters:**
   - `cancellation-token`: `CancellationToken | undefined`
   - `write-file`: `WriteFileCallback | undefined`
   - `custom-transformers`: `CustomTransformers | undefined`
   
   **Returns:** `ExitStatus`"
  (^js [update-bundle-project]
   (.done ^js update-bundle-project))
  (^js [update-bundle-project cancellation-token]
   (.done ^js update-bundle-project cancellation-token))
  (^js [update-bundle-project cancellation-token write-file]
   (.done ^js update-bundle-project cancellation-token write-file))
  (^js [update-bundle-project cancellation-token write-file custom-transformers]
   (.done ^js update-bundle-project cancellation-token write-file custom-transformers)))

(defn compiler-options
  "**Returns:** `CompilerOptions`"
  ^js [update-bundle-project]
  (.getCompilerOptions ^js update-bundle-project))

(defn current-directory
  "**Returns:** `string`"
  ^js [update-bundle-project]
  (.getCurrentDirectory ^js update-bundle-project))
