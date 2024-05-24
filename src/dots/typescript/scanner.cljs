(ns dots.typescript.scanner)

(defn start-pos
  "**Returns:** `number`"
  ^js [scanner]
  (.getStartPos ^js scanner))

(defn token
  "**Returns:** `SyntaxKind`"
  ^js [scanner]
  (.getToken ^js scanner))

(defn token-full-start
  "**Returns:** `number`"
  ^js [scanner]
  (.getTokenFullStart ^js scanner))

(defn token-start
  "**Returns:** `number`"
  ^js [scanner]
  (.getTokenStart ^js scanner))

(defn token-end
  "**Returns:** `number`"
  ^js [scanner]
  (.getTokenEnd ^js scanner))

(defn text-pos
  "**Returns:** `number`"
  ^js [scanner]
  (.getTextPos ^js scanner))

(defn token-pos
  "**Returns:** `number`"
  ^js [scanner]
  (.getTokenPos ^js scanner))

(defn token-text
  "**Returns:** `string`"
  ^js [scanner]
  (.getTokenText ^js scanner))

(defn token-value
  "**Returns:** `string`"
  ^js [scanner]
  (.getTokenValue ^js scanner))

(defn has-unicode-escape?
  "**Returns:** `boolean`"
  ^js [scanner]
  (.hasUnicodeEscape ^js scanner))

(defn has-extended-unicode-escape?
  "**Returns:** `boolean`"
  ^js [scanner]
  (.hasExtendedUnicodeEscape ^js scanner))

(defn has-preceding-line-break?
  "**Returns:** `boolean`"
  ^js [scanner]
  (.hasPrecedingLineBreak ^js scanner))

(defn identifier?
  "**Returns:** `boolean`"
  ^js [scanner]
  (.isIdentifier ^js scanner))

(defn reserved-word?
  "**Returns:** `boolean`"
  ^js [scanner]
  (.isReservedWord ^js scanner))

(defn unterminated?
  "**Returns:** `boolean`"
  ^js [scanner]
  (.isUnterminated ^js scanner))

(defn re-scan-greater-token
  "**Returns:** `SyntaxKind`"
  ^js [scanner]
  (.reScanGreaterToken ^js scanner))

(defn re-scan-slash-token
  "**Returns:** `SyntaxKind`"
  ^js [scanner]
  (.reScanSlashToken ^js scanner))

(defn re-scan-asterisk-equals-token
  "**Returns:** `SyntaxKind`"
  ^js [scanner]
  (.reScanAsteriskEqualsToken ^js scanner))

(defn re-scan-template-token
  "**Parameters:**
   - `tagged-template?`: `boolean`
   
   **Returns:** `SyntaxKind`"
  ^js [scanner tagged-template?]
  (.reScanTemplateToken ^js scanner tagged-template?))

(defn re-scan-template-head-or-no-substitution-template
  "**Returns:** `SyntaxKind`"
  ^js [scanner]
  (.reScanTemplateHeadOrNoSubstitutionTemplate ^js scanner))

(defn scan-jsx-identifier
  "**Returns:** `SyntaxKind`"
  ^js [scanner]
  (.scanJsxIdentifier ^js scanner))

(defn scan-jsx-attribute-value
  "**Returns:** `SyntaxKind`"
  ^js [scanner]
  (.scanJsxAttributeValue ^js scanner))

(defn re-scan-jsx-attribute-value
  "**Returns:** `SyntaxKind`"
  ^js [scanner]
  (.reScanJsxAttributeValue ^js scanner))

(defn re-scan-jsx-token
  "**Parameters:**
   - `allow-multiline-jsx-text?`: `boolean | undefined`
   
   **Returns:** `JsxTokenSyntaxKind`"
  (^js [scanner]
   (.reScanJsxToken ^js scanner))
  (^js [scanner allow-multiline-jsx-text?]
   (.reScanJsxToken ^js scanner allow-multiline-jsx-text?)))

(defn re-scan-less-than-token
  "**Returns:** `SyntaxKind`"
  ^js [scanner]
  (.reScanLessThanToken ^js scanner))

(defn re-scan-hash-token
  "**Returns:** `SyntaxKind`"
  ^js [scanner]
  (.reScanHashToken ^js scanner))

(defn re-scan-question-token
  "**Returns:** `SyntaxKind`"
  ^js [scanner]
  (.reScanQuestionToken ^js scanner))

(defn re-scan-invalid-identifier
  "**Returns:** `SyntaxKind`"
  ^js [scanner]
  (.reScanInvalidIdentifier ^js scanner))

(defn scan-jsx-token
  "**Returns:** `JsxTokenSyntaxKind`"
  ^js [scanner]
  (.scanJsxToken ^js scanner))

(defn scan-js-doc-token
  "**Returns:** `JSDocSyntaxKind`"
  ^js [scanner]
  (.scanJsDocToken ^js scanner))

(defn scan
  "**Returns:** `SyntaxKind`"
  ^js [scanner]
  (.scan ^js scanner))

(defn text
  "**Returns:** `string`"
  ^js [scanner]
  (.getText ^js scanner))

(defn set-text
  "**Parameters:**
   - `text`: `string | undefined`
   - `start`: `number | undefined`
   - `length`: `number | undefined`
   
   **Returns:** `void`"
  (^js [scanner]
   (.setText ^js scanner))
  (^js [scanner text]
   (.setText ^js scanner text))
  (^js [scanner text start]
   (.setText ^js scanner text start))
  (^js [scanner text start length]
   (.setText ^js scanner text start length)))

(defn set-on-error
  "**Parameters:**
   - `on-error`: `ErrorCallback | undefined`
   
   **Returns:** `void`"
  (^js [scanner]
   (.setOnError ^js scanner))
  (^js [scanner on-error]
   (.setOnError ^js scanner on-error)))

(defn set-script-target
  "**Parameters:**
   - `script-target`: `ScriptTarget`
   
   **Returns:** `void`"
  ^js [scanner script-target]
  (.setScriptTarget ^js scanner script-target))

(defn set-language-variant
  "**Parameters:**
   - `variant`: `LanguageVariant`
   
   **Returns:** `void`"
  ^js [scanner variant]
  (.setLanguageVariant ^js scanner variant))

(defn set-script-kind
  "**Parameters:**
   - `script-kind`: `ScriptKind`
   
   **Returns:** `void`"
  ^js [scanner script-kind]
  (.setScriptKind ^js scanner script-kind))

(defn set-js-doc-parsing-mode
  "**Parameters:**
   - `kind`: `JSDocParsingMode`
   
   **Returns:** `void`"
  ^js [scanner kind]
  (.setJSDocParsingMode ^js scanner kind))

(defn set-text-pos
  "**Parameters:**
   - `text-pos`: `number`
   
   **Returns:** `void`"
  ^js [scanner text-pos]
  (.setTextPos ^js scanner text-pos))

(defn reset-token-state
  "**Parameters:**
   - `pos`: `number`
   
   **Returns:** `void`"
  ^js [scanner pos]
  (.resetTokenState ^js scanner pos))

(defn look-ahead
  "**Parameters:**
   - `callback`: `() => T`
   
   **Returns:** `T`"
  ^js [scanner callback]
  (.lookAhead ^js scanner callback))

(defn scan-range
  "**Parameters:**
   - `start`: `number`
   - `length`: `number`
   - `callback`: `() => T`
   
   **Returns:** `T`"
  ^js [scanner start length callback]
  (.scanRange ^js scanner start length callback))

(defn try-scan
  "**Parameters:**
   - `callback`: `() => T`
   
   **Returns:** `T`"
  ^js [scanner callback]
  (.tryScan ^js scanner callback))
