(ns dots.typescript.call-hierarchy-item
  (:refer-clojure :exclude [name]))

(defn name
  ^js [call-hierarchy-item]
  (.-name ^js call-hierarchy-item))

(defn set-name!
  ^js [call-hierarchy-item value]
  (set! (.-name ^js call-hierarchy-item) value))

(defn kind
  ^js [call-hierarchy-item]
  (.-kind ^js call-hierarchy-item))

(defn set-kind!
  ^js [call-hierarchy-item value]
  (set! (.-kind ^js call-hierarchy-item) value))

(defn kind-modifiers
  ^js [call-hierarchy-item]
  (.-kindModifiers ^js call-hierarchy-item))

(defn set-kind-modifiers!
  ^js [call-hierarchy-item value]
  (set! (.-kindModifiers ^js call-hierarchy-item) value))

(defn file
  ^js [call-hierarchy-item]
  (.-file ^js call-hierarchy-item))

(defn set-file!
  ^js [call-hierarchy-item value]
  (set! (.-file ^js call-hierarchy-item) value))

(defn span
  ^js [call-hierarchy-item]
  (.-span ^js call-hierarchy-item))

(defn set-span!
  ^js [call-hierarchy-item value]
  (set! (.-span ^js call-hierarchy-item) value))

(defn selection-span
  ^js [call-hierarchy-item]
  (.-selectionSpan ^js call-hierarchy-item))

(defn set-selection-span!
  ^js [call-hierarchy-item value]
  (set! (.-selectionSpan ^js call-hierarchy-item) value))

(defn container-name
  ^js [call-hierarchy-item]
  (.-containerName ^js call-hierarchy-item))

(defn set-container-name!
  ^js [call-hierarchy-item value]
  (set! (.-containerName ^js call-hierarchy-item) value))
