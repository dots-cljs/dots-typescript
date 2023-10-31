(ns dots.typescript.referenced-symbol-definition-info
  (:refer-clojure :exclude [name]))

(defn display-parts
  ^js [referenced-symbol-definition-info]
  (.-displayParts ^js referenced-symbol-definition-info))

(defn set-display-parts!
  ^js [referenced-symbol-definition-info value]
  (set! (.-displayParts ^js referenced-symbol-definition-info) value))

(defn kind
  ^js [referenced-symbol-definition-info]
  (.-kind ^js referenced-symbol-definition-info))

(defn set-kind!
  ^js [referenced-symbol-definition-info value]
  (set! (.-kind ^js referenced-symbol-definition-info) value))

(defn name
  ^js [referenced-symbol-definition-info]
  (.-name ^js referenced-symbol-definition-info))

(defn set-name!
  ^js [referenced-symbol-definition-info value]
  (set! (.-name ^js referenced-symbol-definition-info) value))

(defn container-kind
  ^js [referenced-symbol-definition-info]
  (.-containerKind ^js referenced-symbol-definition-info))

(defn set-container-kind!
  ^js [referenced-symbol-definition-info value]
  (set! (.-containerKind ^js referenced-symbol-definition-info) value))

(defn container-name
  ^js [referenced-symbol-definition-info]
  (.-containerName ^js referenced-symbol-definition-info))

(defn set-container-name!
  ^js [referenced-symbol-definition-info value]
  (set! (.-containerName ^js referenced-symbol-definition-info) value))

(defn unverified?
  ^js [referenced-symbol-definition-info]
  (.-unverified ^js referenced-symbol-definition-info))

(defn set-unverified!
  ^js [referenced-symbol-definition-info value]
  (set! (.-unverified ^js referenced-symbol-definition-info) value))

(defn text-span
  ^js [referenced-symbol-definition-info]
  (.-textSpan ^js referenced-symbol-definition-info))

(defn set-text-span!
  ^js [referenced-symbol-definition-info value]
  (set! (.-textSpan ^js referenced-symbol-definition-info) value))

(defn file-name
  ^js [referenced-symbol-definition-info]
  (.-fileName ^js referenced-symbol-definition-info))

(defn set-file-name!
  ^js [referenced-symbol-definition-info value]
  (set! (.-fileName ^js referenced-symbol-definition-info) value))

(defn original-text-span
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here"
  ^js [referenced-symbol-definition-info]
  (.-originalTextSpan ^js referenced-symbol-definition-info))

(defn set-original-text-span!
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here"
  ^js [referenced-symbol-definition-info value]
  (set! (.-originalTextSpan ^js referenced-symbol-definition-info) value))

(defn original-file-name
  ^js [referenced-symbol-definition-info]
  (.-originalFileName ^js referenced-symbol-definition-info))

(defn set-original-file-name!
  ^js [referenced-symbol-definition-info value]
  (set! (.-originalFileName ^js referenced-symbol-definition-info) value))

(defn context-span
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration"
  ^js [referenced-symbol-definition-info]
  (.-contextSpan ^js referenced-symbol-definition-info))

(defn set-context-span!
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration"
  ^js [referenced-symbol-definition-info value]
  (set! (.-contextSpan ^js referenced-symbol-definition-info) value))

(defn original-context-span
  ^js [referenced-symbol-definition-info]
  (.-originalContextSpan ^js referenced-symbol-definition-info))

(defn set-original-context-span!
  ^js [referenced-symbol-definition-info value]
  (set! (.-originalContextSpan ^js referenced-symbol-definition-info) value))
