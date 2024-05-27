(ns dots.typescript.format-code-settings)

(defn insert-space-after-comma-delimiter?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceAfterCommaDelimiter ^js format-code-settings))

(defn insert-space-after-semicolon-in-for-statements?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceAfterSemicolonInForStatements ^js format-code-settings))

(defn insert-space-before-and-after-binary-operators?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceBeforeAndAfterBinaryOperators ^js format-code-settings))

(defn insert-space-after-constructor?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceAfterConstructor ^js format-code-settings))

(defn insert-space-after-keywords-in-control-flow-statements?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceAfterKeywordsInControlFlowStatements ^js format-code-settings))

(defn insert-space-after-function-keyword-for-anonymous-functions?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceAfterFunctionKeywordForAnonymousFunctions ^js format-code-settings))

(defn insert-space-after-opening-and-before-closing-nonempty-parenthesis?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis ^js format-code-settings))

(defn insert-space-after-opening-and-before-closing-nonempty-brackets?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets ^js format-code-settings))

(defn insert-space-after-opening-and-before-closing-nonempty-braces?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces ^js format-code-settings))

(defn insert-space-after-opening-and-before-closing-empty-braces?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceAfterOpeningAndBeforeClosingEmptyBraces ^js format-code-settings))

(defn insert-space-after-opening-and-before-closing-template-string-braces?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces ^js format-code-settings))

(defn insert-space-after-opening-and-before-closing-jsx-expression-braces?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces ^js format-code-settings))

(defn insert-space-after-type-assertion?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceAfterTypeAssertion ^js format-code-settings))

(defn insert-space-before-function-parenthesis?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceBeforeFunctionParenthesis ^js format-code-settings))

(defn place-open-brace-on-new-line-for-functions?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-placeOpenBraceOnNewLineForFunctions ^js format-code-settings))

(defn place-open-brace-on-new-line-for-control-blocks?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-placeOpenBraceOnNewLineForControlBlocks ^js format-code-settings))

(defn insert-space-before-type-annotation?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-insertSpaceBeforeTypeAnnotation ^js format-code-settings))

(defn indent-multi-line-object-literal-beginning-on-blank-line?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-indentMultiLineObjectLiteralBeginningOnBlankLine ^js format-code-settings))

(defn semicolons
  "**Returns:** `SemicolonPreference | undefined`"
  ^js [format-code-settings]
  (.-semicolons ^js format-code-settings))

(defn indent-switch-case?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-indentSwitchCase ^js format-code-settings))

(defn base-indent-size
  "**Returns:** `number | undefined`"
  ^js [format-code-settings]
  (.-baseIndentSize ^js format-code-settings))

(defn set-base-indent-size!
  ^js [format-code-settings value]
  (set! (.-baseIndentSize ^js format-code-settings) value))

(defn indent-size
  "**Returns:** `number | undefined`"
  ^js [format-code-settings]
  (.-indentSize ^js format-code-settings))

(defn set-indent-size!
  ^js [format-code-settings value]
  (set! (.-indentSize ^js format-code-settings) value))

(defn tab-size
  "**Returns:** `number | undefined`"
  ^js [format-code-settings]
  (.-tabSize ^js format-code-settings))

(defn set-tab-size!
  ^js [format-code-settings value]
  (set! (.-tabSize ^js format-code-settings) value))

(defn new-line-character
  "**Returns:** `string | undefined`"
  ^js [format-code-settings]
  (.-newLineCharacter ^js format-code-settings))

(defn set-new-line-character!
  ^js [format-code-settings value]
  (set! (.-newLineCharacter ^js format-code-settings) value))

(defn convert-tabs-to-spaces?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-convertTabsToSpaces ^js format-code-settings))

(defn set-convert-tabs-to-spaces!
  ^js [format-code-settings value]
  (set! (.-convertTabsToSpaces ^js format-code-settings) value))

(defn indent-style
  "**Returns:** `IndentStyle | undefined`"
  ^js [format-code-settings]
  (.-indentStyle ^js format-code-settings))

(defn set-indent-style!
  ^js [format-code-settings value]
  (set! (.-indentStyle ^js format-code-settings) value))

(defn trim-trailing-whitespace?
  "**Returns:** `boolean | undefined`"
  ^js [format-code-settings]
  (.-trimTrailingWhitespace ^js format-code-settings))

(defn set-trim-trailing-whitespace!
  ^js [format-code-settings value]
  (set! (.-trimTrailingWhitespace ^js format-code-settings) value))
