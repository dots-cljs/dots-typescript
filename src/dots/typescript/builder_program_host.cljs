(ns dots.typescript.builder-program-host)

(defn create-hash
  "If provided this would be used this hash instead of actual file shape text for detecting changes"
  ^js [builder-program-host]
  (.-createHash ^js builder-program-host))

(defn set-create-hash!
  "If provided this would be used this hash instead of actual file shape text for detecting changes"
  ^js [builder-program-host value]
  (set! (.-createHash ^js builder-program-host) value))

(defn write-file
  "When emit or emitNextAffectedFile are called without writeFile,
   this callback if present would be used to write files"
  ^js [builder-program-host]
  (.-writeFile ^js builder-program-host))

(defn set-write-file!
  "When emit or emitNextAffectedFile are called without writeFile,
   this callback if present would be used to write files"
  ^js [builder-program-host value]
  (set! (.-writeFile ^js builder-program-host) value))
