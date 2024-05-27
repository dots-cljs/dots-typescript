(ns dots.typescript.server.protocol.project-info
  "Response message body for \"projectInfo\" request")

(defn config-file-name
  "For configured project, this is the normalized path of the 'tsconfig.json' file
   For inferred project, this is undefined
   
   **Returns:** `string`"
  ^js [project-info]
  (.-configFileName ^js project-info))

(defn set-config-file-name!
  "For configured project, this is the normalized path of the 'tsconfig.json' file
   For inferred project, this is undefined"
  ^js [project-info value]
  (set! (.-configFileName ^js project-info) value))

(defn file-names
  "The list of normalized file name in the project, including 'lib.d.ts'
   
   **Returns:** `string[] | undefined`"
  ^js [project-info]
  (.-fileNames ^js project-info))

(defn set-file-names!
  "The list of normalized file name in the project, including 'lib.d.ts'"
  ^js [project-info value]
  (set! (.-fileNames ^js project-info) value))

(defn language-service-disabled?
  "Indicates if the project has a active language service instance
   
   **Returns:** `boolean | undefined`"
  ^js [project-info]
  (.-languageServiceDisabled ^js project-info))

(defn set-language-service-disabled!
  "Indicates if the project has a active language service instance"
  ^js [project-info value]
  (set! (.-languageServiceDisabled ^js project-info) value))
