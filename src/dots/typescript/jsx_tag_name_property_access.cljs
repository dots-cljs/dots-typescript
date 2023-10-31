(ns dots.typescript.jsx-tag-name-property-access
  (:refer-clojure :exclude [name]))

(defn expression
  ^js [jsx-tag-name-property-access]
  (.-expression ^js jsx-tag-name-property-access))

(defn kind
  ^js [jsx-tag-name-property-access]
  (.-kind ^js jsx-tag-name-property-access))

(defn question-dot-token
  ^js [jsx-tag-name-property-access]
  (.-questionDotToken ^js jsx-tag-name-property-access))

(defn name
  ^js [jsx-tag-name-property-access]
  (.-name ^js jsx-tag-name-property-access))

(defn flags
  ^js [jsx-tag-name-property-access]
  (.-flags ^js jsx-tag-name-property-access))

(defn parent
  ^js [jsx-tag-name-property-access]
  (.-parent ^js jsx-tag-name-property-access))

(defn source-file
  ^js [jsx-tag-name-property-access]
  (.getSourceFile ^js jsx-tag-name-property-access))

(defn child-count
  (^js [jsx-tag-name-property-access]
   (.getChildCount ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getChildCount ^js jsx-tag-name-property-access source-file)))

(defn child-at
  (^js [jsx-tag-name-property-access index]
   (.getChildAt ^js jsx-tag-name-property-access index))
  (^js [jsx-tag-name-property-access index source-file]
   (.getChildAt ^js jsx-tag-name-property-access index source-file)))

(defn children
  (^js [jsx-tag-name-property-access]
   (.getChildren ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getChildren ^js jsx-tag-name-property-access source-file)))

(defn start
  (^js [jsx-tag-name-property-access]
   (.getStart ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getStart ^js jsx-tag-name-property-access source-file))
  (^js [jsx-tag-name-property-access source-file include-js-doc-comment?]
   (.getStart ^js jsx-tag-name-property-access source-file include-js-doc-comment?)))

(defn full-start
  ^js [jsx-tag-name-property-access]
  (.getFullStart ^js jsx-tag-name-property-access))

(defn get-end
  ^js [jsx-tag-name-property-access]
  (.getEnd ^js jsx-tag-name-property-access))

(defn width
  (^js [jsx-tag-name-property-access]
   (.getWidth ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getWidth ^js jsx-tag-name-property-access source-file)))

(defn full-width
  ^js [jsx-tag-name-property-access]
  (.getFullWidth ^js jsx-tag-name-property-access))

(defn leading-trivia-width
  (^js [jsx-tag-name-property-access]
   (.getLeadingTriviaWidth ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getLeadingTriviaWidth ^js jsx-tag-name-property-access source-file)))

(defn full-text
  (^js [jsx-tag-name-property-access]
   (.getFullText ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getFullText ^js jsx-tag-name-property-access source-file)))

(defn text
  (^js [jsx-tag-name-property-access]
   (.getText ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getText ^js jsx-tag-name-property-access source-file)))

(defn first-token
  (^js [jsx-tag-name-property-access]
   (.getFirstToken ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getFirstToken ^js jsx-tag-name-property-access source-file)))

(defn last-token
  (^js [jsx-tag-name-property-access]
   (.getLastToken ^js jsx-tag-name-property-access))
  (^js [jsx-tag-name-property-access source-file]
   (.getLastToken ^js jsx-tag-name-property-access source-file)))

(defn for-each-child
  (^js [jsx-tag-name-property-access cb-node]
   (.forEachChild ^js jsx-tag-name-property-access cb-node))
  (^js [jsx-tag-name-property-access cb-node cb-node-array]
   (.forEachChild ^js jsx-tag-name-property-access cb-node cb-node-array)))

(defn decorators
  ^js [jsx-tag-name-property-access]
  (.-decorators ^js jsx-tag-name-property-access))

(defn modifiers
  ^js [jsx-tag-name-property-access]
  (.-modifiers ^js jsx-tag-name-property-access))

(defn pos
  ^js [jsx-tag-name-property-access]
  (.-pos ^js jsx-tag-name-property-access))

(defn end
  ^js [jsx-tag-name-property-access]
  (.-end ^js jsx-tag-name-property-access))
