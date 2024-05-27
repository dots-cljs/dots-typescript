(ns dots.typescript.server.protocol.file-with-project-reference-redirect-info)

(defn file-name
  "Name of file
   
   **Returns:** `string`"
  ^js [file-with-project-reference-redirect-info]
  (.-fileName ^js file-with-project-reference-redirect-info))

(defn set-file-name!
  "Name of file"
  ^js [file-with-project-reference-redirect-info value]
  (set! (.-fileName ^js file-with-project-reference-redirect-info) value))

(defn source-of-project-reference-redirect?
  "True if the file is primarily included in a referenced project
   
   **Returns:** `boolean`"
  ^js [file-with-project-reference-redirect-info]
  (.-isSourceOfProjectReferenceRedirect ^js file-with-project-reference-redirect-info))

(defn set-is-source-of-project-reference-redirect!
  "True if the file is primarily included in a referenced project"
  ^js [file-with-project-reference-redirect-info value]
  (set! (.-isSourceOfProjectReferenceRedirect ^js file-with-project-reference-redirect-info) value))
