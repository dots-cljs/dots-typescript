(ns dots.typescript.navigate-to-item
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `string`"
  ^js [navigate-to-item]
  (.-name ^js navigate-to-item))

(defn set-name!
  ^js [navigate-to-item value]
  (set! (.-name ^js navigate-to-item) value))

(defn kind
  "**Returns:** `ScriptElementKind`"
  ^js [navigate-to-item]
  (.-kind ^js navigate-to-item))

(defn set-kind!
  ^js [navigate-to-item value]
  (set! (.-kind ^js navigate-to-item) value))

(defn kind-modifiers
  "**Returns:** `string`"
  ^js [navigate-to-item]
  (.-kindModifiers ^js navigate-to-item))

(defn set-kind-modifiers!
  ^js [navigate-to-item value]
  (set! (.-kindModifiers ^js navigate-to-item) value))

(defn match-kind
  "**Returns:** `\"exact\" | \"prefix\" | \"substring\" | \"camelCase\"`"
  ^js [navigate-to-item]
  (.-matchKind ^js navigate-to-item))

(defn set-match-kind!
  ^js [navigate-to-item value]
  (set! (.-matchKind ^js navigate-to-item) value))

(defn case-sensitive?
  "**Returns:** `boolean`"
  ^js [navigate-to-item]
  (.-isCaseSensitive ^js navigate-to-item))

(defn set-is-case-sensitive!
  ^js [navigate-to-item value]
  (set! (.-isCaseSensitive ^js navigate-to-item) value))

(defn file-name
  "**Returns:** `string`"
  ^js [navigate-to-item]
  (.-fileName ^js navigate-to-item))

(defn set-file-name!
  ^js [navigate-to-item value]
  (set! (.-fileName ^js navigate-to-item) value))

(defn text-span
  "**Returns:** `TextSpan`"
  ^js [navigate-to-item]
  (.-textSpan ^js navigate-to-item))

(defn set-text-span!
  ^js [navigate-to-item value]
  (set! (.-textSpan ^js navigate-to-item) value))

(defn container-name
  "**Returns:** `string`"
  ^js [navigate-to-item]
  (.-containerName ^js navigate-to-item))

(defn set-container-name!
  ^js [navigate-to-item value]
  (set! (.-containerName ^js navigate-to-item) value))

(defn container-kind
  "**Returns:** `ScriptElementKind`"
  ^js [navigate-to-item]
  (.-containerKind ^js navigate-to-item))

(defn set-container-kind!
  ^js [navigate-to-item value]
  (set! (.-containerKind ^js navigate-to-item) value))
