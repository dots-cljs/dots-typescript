(ns dots.typescript.js-doc-member-name
  "Class#method reference in JSDoc")

(defn kind
  ^js [js-doc-member-name]
  (.-kind ^js js-doc-member-name))

(defn left
  ^js [js-doc-member-name]
  (.-left ^js js-doc-member-name))

(defn right
  ^js [js-doc-member-name]
  (.-right ^js js-doc-member-name))

(defn flags
  ^js [js-doc-member-name]
  (.-flags ^js js-doc-member-name))

(defn parent
  ^js [js-doc-member-name]
  (.-parent ^js js-doc-member-name))

(defn source-file
  ^js [js-doc-member-name]
  (.getSourceFile ^js js-doc-member-name))

(defn child-count
  (^js [js-doc-member-name]
   (.getChildCount ^js js-doc-member-name))
  (^js [js-doc-member-name source-file]
   (.getChildCount ^js js-doc-member-name source-file)))

(defn child-at
  (^js [js-doc-member-name index]
   (.getChildAt ^js js-doc-member-name index))
  (^js [js-doc-member-name index source-file]
   (.getChildAt ^js js-doc-member-name index source-file)))

(defn children
  (^js [js-doc-member-name]
   (.getChildren ^js js-doc-member-name))
  (^js [js-doc-member-name source-file]
   (.getChildren ^js js-doc-member-name source-file)))

(defn start
  (^js [js-doc-member-name]
   (.getStart ^js js-doc-member-name))
  (^js [js-doc-member-name source-file]
   (.getStart ^js js-doc-member-name source-file))
  (^js [js-doc-member-name source-file include-js-doc-comment?]
   (.getStart ^js js-doc-member-name source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-member-name]
  (.getFullStart ^js js-doc-member-name))

(defn get-end
  ^js [js-doc-member-name]
  (.getEnd ^js js-doc-member-name))

(defn width
  (^js [js-doc-member-name]
   (.getWidth ^js js-doc-member-name))
  (^js [js-doc-member-name source-file]
   (.getWidth ^js js-doc-member-name source-file)))

(defn full-width
  ^js [js-doc-member-name]
  (.getFullWidth ^js js-doc-member-name))

(defn leading-trivia-width
  (^js [js-doc-member-name]
   (.getLeadingTriviaWidth ^js js-doc-member-name))
  (^js [js-doc-member-name source-file]
   (.getLeadingTriviaWidth ^js js-doc-member-name source-file)))

(defn full-text
  (^js [js-doc-member-name]
   (.getFullText ^js js-doc-member-name))
  (^js [js-doc-member-name source-file]
   (.getFullText ^js js-doc-member-name source-file)))

(defn text
  (^js [js-doc-member-name]
   (.getText ^js js-doc-member-name))
  (^js [js-doc-member-name source-file]
   (.getText ^js js-doc-member-name source-file)))

(defn first-token
  (^js [js-doc-member-name]
   (.getFirstToken ^js js-doc-member-name))
  (^js [js-doc-member-name source-file]
   (.getFirstToken ^js js-doc-member-name source-file)))

(defn last-token
  (^js [js-doc-member-name]
   (.getLastToken ^js js-doc-member-name))
  (^js [js-doc-member-name source-file]
   (.getLastToken ^js js-doc-member-name source-file)))

(defn for-each-child
  (^js [js-doc-member-name cb-node]
   (.forEachChild ^js js-doc-member-name cb-node))
  (^js [js-doc-member-name cb-node cb-node-array]
   (.forEachChild ^js js-doc-member-name cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-member-name]
  (.-decorators ^js js-doc-member-name))

(defn modifiers
  ^js [js-doc-member-name]
  (.-modifiers ^js js-doc-member-name))

(defn pos
  ^js [js-doc-member-name]
  (.-pos ^js js-doc-member-name))

(defn end
  ^js [js-doc-member-name]
  (.-end ^js js-doc-member-name))
