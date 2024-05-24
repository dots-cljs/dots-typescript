(ns dots.typescript.server.project-info-telemetry-event-data)

(defn project-id
  "Cryptographically secure hash of project file location."
  ^js [project-info-telemetry-event-data]
  (.-projectId ^js project-info-telemetry-event-data))

(defn file-stats
  "Count of file extensions seen in the project."
  ^js [project-info-telemetry-event-data]
  (.-fileStats ^js project-info-telemetry-event-data))

(defn compiler-options
  "Any compiler options that might contain paths will be taken out.
   Enum compiler options will be converted to strings."
  ^js [project-info-telemetry-event-data]
  (.-compilerOptions ^js project-info-telemetry-event-data))

(defn extends?
  ^js [project-info-telemetry-event-data]
  (.-extends ^js project-info-telemetry-event-data))

(defn files?
  ^js [project-info-telemetry-event-data]
  (.-files ^js project-info-telemetry-event-data))

(defn include?
  ^js [project-info-telemetry-event-data]
  (.-include ^js project-info-telemetry-event-data))

(defn exclude?
  ^js [project-info-telemetry-event-data]
  (.-exclude ^js project-info-telemetry-event-data))

(defn compile-on-save?
  ^js [project-info-telemetry-event-data]
  (.-compileOnSave ^js project-info-telemetry-event-data))

(defn type-acquisition
  ^js [project-info-telemetry-event-data]
  (.-typeAcquisition ^js project-info-telemetry-event-data))

(defn config-file-name
  ^js [project-info-telemetry-event-data]
  (.-configFileName ^js project-info-telemetry-event-data))

(defn project-type
  ^js [project-info-telemetry-event-data]
  (.-projectType ^js project-info-telemetry-event-data))

(defn language-service-enabled?
  ^js [project-info-telemetry-event-data]
  (.-languageServiceEnabled ^js project-info-telemetry-event-data))

(defn version
  "TypeScript version used by the server."
  ^js [project-info-telemetry-event-data]
  (.-version ^js project-info-telemetry-event-data))
