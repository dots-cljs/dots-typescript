(ns dots.typescript.pre-processed-file-info)

(defn referenced-files
  ^js [pre-processed-file-info]
  (.-referencedFiles ^js pre-processed-file-info))

(defn set-referenced-files!
  ^js [pre-processed-file-info value]
  (set! (.-referencedFiles ^js pre-processed-file-info) value))

(defn type-reference-directives
  ^js [pre-processed-file-info]
  (.-typeReferenceDirectives ^js pre-processed-file-info))

(defn set-type-reference-directives!
  ^js [pre-processed-file-info value]
  (set! (.-typeReferenceDirectives ^js pre-processed-file-info) value))

(defn lib-reference-directives
  ^js [pre-processed-file-info]
  (.-libReferenceDirectives ^js pre-processed-file-info))

(defn set-lib-reference-directives!
  ^js [pre-processed-file-info value]
  (set! (.-libReferenceDirectives ^js pre-processed-file-info) value))

(defn imported-files
  ^js [pre-processed-file-info]
  (.-importedFiles ^js pre-processed-file-info))

(defn set-imported-files!
  ^js [pre-processed-file-info value]
  (set! (.-importedFiles ^js pre-processed-file-info) value))

(defn ambient-external-modules
  ^js [pre-processed-file-info]
  (.-ambientExternalModules ^js pre-processed-file-info))

(defn set-ambient-external-modules!
  ^js [pre-processed-file-info value]
  (set! (.-ambientExternalModules ^js pre-processed-file-info) value))

(defn lib-file?
  ^js [pre-processed-file-info]
  (.-isLibFile ^js pre-processed-file-info))

(defn set-is-lib-file!
  ^js [pre-processed-file-info value]
  (set! (.-isLibFile ^js pre-processed-file-info) value))
