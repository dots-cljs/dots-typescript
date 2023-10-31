(ns dots.typescript.binding-element
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [binding-element]
  (.-kind ^js binding-element))

(defn parent
  ^js [binding-element]
  (.-parent ^js binding-element))

(defn property-name
  ^js [binding-element]
  (.-propertyName ^js binding-element))

(defn dot-dot-dot-token
  ^js [binding-element]
  (.-dotDotDotToken ^js binding-element))

(defn name
  ^js [binding-element]
  (.-name ^js binding-element))

(defn initializer
  ^js [binding-element]
  (.-initializer ^js binding-element))

(defn flags
  ^js [binding-element]
  (.-flags ^js binding-element))

(defn source-file
  ^js [binding-element]
  (.getSourceFile ^js binding-element))

(defn child-count
  (^js [binding-element]
   (.getChildCount ^js binding-element))
  (^js [binding-element source-file]
   (.getChildCount ^js binding-element source-file)))

(defn child-at
  (^js [binding-element index]
   (.getChildAt ^js binding-element index))
  (^js [binding-element index source-file]
   (.getChildAt ^js binding-element index source-file)))

(defn children
  (^js [binding-element]
   (.getChildren ^js binding-element))
  (^js [binding-element source-file]
   (.getChildren ^js binding-element source-file)))

(defn start
  (^js [binding-element]
   (.getStart ^js binding-element))
  (^js [binding-element source-file]
   (.getStart ^js binding-element source-file))
  (^js [binding-element source-file include-js-doc-comment?]
   (.getStart ^js binding-element source-file include-js-doc-comment?)))

(defn full-start
  ^js [binding-element]
  (.getFullStart ^js binding-element))

(defn get-end
  ^js [binding-element]
  (.getEnd ^js binding-element))

(defn width
  (^js [binding-element]
   (.getWidth ^js binding-element))
  (^js [binding-element source-file]
   (.getWidth ^js binding-element source-file)))

(defn full-width
  ^js [binding-element]
  (.getFullWidth ^js binding-element))

(defn leading-trivia-width
  (^js [binding-element]
   (.getLeadingTriviaWidth ^js binding-element))
  (^js [binding-element source-file]
   (.getLeadingTriviaWidth ^js binding-element source-file)))

(defn full-text
  (^js [binding-element]
   (.getFullText ^js binding-element))
  (^js [binding-element source-file]
   (.getFullText ^js binding-element source-file)))

(defn text
  (^js [binding-element]
   (.getText ^js binding-element))
  (^js [binding-element source-file]
   (.getText ^js binding-element source-file)))

(defn first-token
  (^js [binding-element]
   (.getFirstToken ^js binding-element))
  (^js [binding-element source-file]
   (.getFirstToken ^js binding-element source-file)))

(defn last-token
  (^js [binding-element]
   (.getLastToken ^js binding-element))
  (^js [binding-element source-file]
   (.getLastToken ^js binding-element source-file)))

(defn for-each-child
  (^js [binding-element cb-node]
   (.forEachChild ^js binding-element cb-node))
  (^js [binding-element cb-node cb-node-array]
   (.forEachChild ^js binding-element cb-node cb-node-array)))

(defn decorators
  ^js [binding-element]
  (.-decorators ^js binding-element))

(defn modifiers
  ^js [binding-element]
  (.-modifiers ^js binding-element))

(defn pos
  ^js [binding-element]
  (.-pos ^js binding-element))

(defn end
  ^js [binding-element]
  (.-end ^js binding-element))
