(ns dots.typescript.server.project-info-telemetry-event-data)

(defn project-id
  "Cryptographically secure hash of project file location.
   
   **Returns:** `string`"
  ^js [project-info-telemetry-event-data]
  (.-projectId ^js project-info-telemetry-event-data))

(defn file-stats
  "Count of file extensions seen in the project.
   
   **Returns:** `FileStats`"
  ^js [project-info-telemetry-event-data]
  (.-fileStats ^js project-info-telemetry-event-data))

(defn compiler-options
  "Any compiler options that might contain paths will be taken out.
   Enum compiler options will be converted to strings.
   
   **Returns:** `CompilerOptions`"
  ^js [project-info-telemetry-event-data]
  (.-compilerOptions ^js project-info-telemetry-event-data))

(defn extends?
  "**Returns:** `boolean | undefined`"
  ^js [project-info-telemetry-event-data]
  (.-extends ^js project-info-telemetry-event-data))

(defn files?
  "**Returns:** `boolean | undefined`"
  ^js [project-info-telemetry-event-data]
  (.-files ^js project-info-telemetry-event-data))

(defn include?
  "**Returns:** `boolean | undefined`"
  ^js [project-info-telemetry-event-data]
  (.-include ^js project-info-telemetry-event-data))

(defn exclude?
  "**Returns:** `boolean | undefined`"
  ^js [project-info-telemetry-event-data]
  (.-exclude ^js project-info-telemetry-event-data))

(defn compile-on-save?
  "**Returns:** `boolean`"
  ^js [project-info-telemetry-event-data]
  (.-compileOnSave ^js project-info-telemetry-event-data))

(defn type-acquisition
  "**Returns:** `ProjectInfoTypeAcquisitionData`"
  ^js [project-info-telemetry-event-data]
  (.-typeAcquisition ^js project-info-telemetry-event-data))

(defn config-file-name
  "**Returns:** `\"tsconfig.json\" | \"jsconfig.json\" | \"other\"`"
  ^js [project-info-telemetry-event-data]
  (.-configFileName ^js project-info-telemetry-event-data))

(defn project-type
  "**Returns:** `\"external\" | \"configured\"`"
  ^js [project-info-telemetry-event-data]
  (.-projectType ^js project-info-telemetry-event-data))

(defn language-service-enabled?
  "**Returns:** `boolean`"
  ^js [project-info-telemetry-event-data]
  (.-languageServiceEnabled ^js project-info-telemetry-event-data))

(defn version
  "TypeScript version used by the server.
   
   **Returns:** `string`"
  ^js [project-info-telemetry-event-data]
  (.-version ^js project-info-telemetry-event-data))
