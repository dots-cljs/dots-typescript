(ns dots.typescript.server.protocol.call-hierarchy-item
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `string`"
  ^js [call-hierarchy-item]
  (.-name ^js call-hierarchy-item))

(defn set-name!
  ^js [call-hierarchy-item value]
  (set! (.-name ^js call-hierarchy-item) value))

(defn kind
  "**Returns:** `ScriptElementKind`"
  ^js [call-hierarchy-item]
  (.-kind ^js call-hierarchy-item))

(defn set-kind!
  ^js [call-hierarchy-item value]
  (set! (.-kind ^js call-hierarchy-item) value))

(defn kind-modifiers
  "**Returns:** `string | undefined`"
  ^js [call-hierarchy-item]
  (.-kindModifiers ^js call-hierarchy-item))

(defn set-kind-modifiers!
  ^js [call-hierarchy-item value]
  (set! (.-kindModifiers ^js call-hierarchy-item) value))

(defn file
  "**Returns:** `string`"
  ^js [call-hierarchy-item]
  (.-file ^js call-hierarchy-item))

(defn set-file!
  ^js [call-hierarchy-item value]
  (set! (.-file ^js call-hierarchy-item) value))

(defn span
  "**Returns:** `TextSpan`"
  ^js [call-hierarchy-item]
  (.-span ^js call-hierarchy-item))

(defn set-span!
  ^js [call-hierarchy-item value]
  (set! (.-span ^js call-hierarchy-item) value))

(defn selection-span
  "**Returns:** `TextSpan`"
  ^js [call-hierarchy-item]
  (.-selectionSpan ^js call-hierarchy-item))

(defn set-selection-span!
  ^js [call-hierarchy-item value]
  (set! (.-selectionSpan ^js call-hierarchy-item) value))

(defn container-name
  "**Returns:** `string | undefined`"
  ^js [call-hierarchy-item]
  (.-containerName ^js call-hierarchy-item))

(defn set-container-name!
  ^js [call-hierarchy-item value]
  (set! (.-containerName ^js call-hierarchy-item) value))
